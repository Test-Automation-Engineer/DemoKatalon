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

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_12345678910111213141516'), behandeling_dag, true)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_JanuaryFebruaryMarchApr'), behandeling_maand, true)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_20162017201820192020202'), behandeling_jaar, true)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_PoliklinischOpname'), type, true)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/input_treatmenttreated_by'), behandelaar)

WebUI.setText(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/input_treatmentname'), naam_behandeling)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_RadiologieChirurgieCard'), afdeling, true)

WebUI.selectOptionByValue(findTestObject('EPD/UI/Page_EPD Toevoegen behandeling/select_LaagNormaalSpoed'), urgentie, true)

