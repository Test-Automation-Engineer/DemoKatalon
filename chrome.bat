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
ECHO Start docker local...

REM Set project_dir="/c/Temp/katalon/sampleWeb/"
REM Set project_dir="katalon"
REM Set report_dir="/c/Temp/katalon/sampleWeb/reports/chrome"

REM -runMode=console -consoleLog -noExit -projectPath="C:\Users\mslin\Katalon Studio\sampleWeb\sampleWeb.prj" -retry=0 -testSuitePath="Test Suites/TS_RegressionTest" -browserType="Chrome"
REM -projectPath=%projectdir%/sampleWeb.prj
REM -projectPath=%project_dir%/sampleWeb.prj
REM -projectPath=/c/Users/mslin/katalonstudio/sampleWeb/sampleWeb.prj
Set katalon_opts="-retry=0 -statusDelay=15 -testSuitePath='Test Suites/TS_DemoEPD' -browserType=Chrome"
docker run -v %projectDir%:/katalon/katalon/source -v %projectDir%reports/chrome/:/katalon/katalon/report -e KATALON_OPTS=%katalon_opts% katalonstudio/katalon
REM :ro
FOR /f "tokens=*" %%i IN ('docker-machine ip %machinename%') DO set varIP=%%i


ECHO.
ECHO.
ECHO Je docker container draait op ip %varIP%
ECHO.

pause