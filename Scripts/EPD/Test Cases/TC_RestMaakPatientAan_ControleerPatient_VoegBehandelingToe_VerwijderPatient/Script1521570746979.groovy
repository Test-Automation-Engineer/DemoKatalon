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

WebUI.callTestCase(findTestCase('EPD/Components/Rest/MaakPatientAanVoorZiekenhuisA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('EPD/Components/UI/StartBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EPD/UI/Page_EPD online/a_Open EPD'))

WebUI.click(findTestObject('EPD/UI/Page_EPD online/a_Overzicht patienten'))

WebUI.callTestCase(findTestCase('EPD/Components/UI/VerifieerPatient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EPD/UI/Page_EPD online/a_Details'))

WebUI.click(findTestObject('EPD/UI/Page_EPD_Patient details/a_Behandeling toevoegen'))

WebUI.callTestCase(findTestCase('EPD/Components/UI/VoegBehandelingToe'), [('behandeling_dag') : behandeling_dag, ('behandeling_maand') : behandeling_maand
        , ('behandeling_jaar') : behandeling_jaar, ('behandelaar') : behandelaar, ('naam_behandeling') : naam_behandeling
        , ('afdeling') : afdeling, ('urgentie') : urgentie, ('type') : type], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/input_commit'))

WebUI.verifyElementPresent(findTestObject('EPD/UI/Page_EPD_Patient details/div_Behandeling is successvol'), 0)

WebUI.click(findTestObject('EPD/UI/Page_EPD_Patient details/a_Verwijderen'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('EPD/UI/Page_EPD_Patient details/div_Patient is succesvol verwi'), 0)

WebUI.callTestCase(findTestCase('EPD/Components/UI/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

