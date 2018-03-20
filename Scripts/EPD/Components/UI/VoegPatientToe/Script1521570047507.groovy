import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientfirst_name'), voornaam)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientlast_name'), achternaam)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientbsn'), bsnnummer)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen patient/select_12345678910111213141516'), geboortedatum_dag, false)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen patient/select_JanuaryFebruaryMarchApr'), geboortedatum_maand, false)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen patient/select_19501951195219531954195'), geboortedatum_jaar, false)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen patient/select_ManVrouw'), geslacht, false)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientstreet'), straat)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientzipcode'), postcode)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientcity'), woonplaats)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientphone'), telefoon)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientemail'), email)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientinsurance_company'), zorgverzekeraar)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen patient/input_patientinsurance_number'), polisnummer)

