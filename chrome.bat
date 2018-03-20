ECHO OFF
REM Set variables below
SET machinename=default
Set winProjectDir=%~dp0

echo %winProjectDir%

SET linProjectDir=/%winProjectDir:\=/%
echo %linProjectDir%

SET projectDir=%linProjectDir:C:=c%
echo %projectDir%

docker-machine start %machinename%

FOR /f "tokens=*" %%i IN ('docker-machine env %machinename%') DO %%i


ECHO.
ECHO Start docker...

Set katalon_opts="-retry=0 -statusDelay=15 -testSuitePath='Test Suites/TS_DemoEPD' -browserType=Chrome"
docker run -v %projectDir%:/katalon/katalon/source -v %projectDir%reports/chrome/:/katalon/katalon/report -e KATALON_OPTS=%katalon_opts% katalonstudio/katalon

FOR /f "tokens=*" %%i IN ('docker-machine ip %machinename%') DO set varIP=%%i


ECHO.
ECHO.
ECHO Docker container klaar met het uitvoeren van testen...
ECHO.

pause