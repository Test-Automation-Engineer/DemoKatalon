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

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_12345678910111213141516'), '6', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_JanuaryFebruaryMarchApr'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_20162017201820192020202'), '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_PoliklinischOpname'), 'Poliklinisch', true)

WebUI.setText(findTestObject('Page_EPD online/input_treatmenttreated_by'), 'Dokter anders')

WebUI.setText(findTestObject('Page_EPD online/input_treatmentname'), 'knie operatie')

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_RadiologieChirurgieCard'), 'Radiologie', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_LaagNormaalSpoed'), 'Normaal', true)

