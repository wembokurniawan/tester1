import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('null'), "$result")

WebUI.openBrowser(GlobalVariable.tiketURL)

WebUI.verifyElementPresent(findTestObject('flight/flightFrom_textfield'), 0)

WebUI.click(findTestObject('flight/flightFrom_textfield'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('flight/jakarta_text'), 0)

WebUI.click(findTestObject('flight/jakarta_text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('flight/flightTo_textField'), 0)

WebUI.setText(findTestObject('flight/flightTo_textField'), 'Surabaya')

not_run: WebUI.click(findTestObject('flight/flightTo_textField'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('flight/surabaya_text'), 0)

WebUI.click(findTestObject('flight/surabaya_text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('flight/mengerti_btn'), 0)

WebUI.click(findTestObject('flight/mengerti_btn'))

