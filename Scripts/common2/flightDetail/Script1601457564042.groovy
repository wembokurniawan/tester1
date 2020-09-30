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
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('testProduct/detailPemesanan_text'), 0)

WebUI.verifyElementPresent(findTestObject('flight/titel_dropdown'), 0)

WebUI.click(findTestObject('flight/titel_dropdown'))

WebUI.verifyElementPresent(findTestObject('testProduct/tuan_text'), 0)

WebUI.click(findTestObject('testProduct/tuan_text'))

WebUI.verifyElementPresent(findTestObject('flight/namaLengkap_textField'), 0)

WebUI.setText(findTestObject('flight/namaLengkap_textField'), 'Automtion Tester')

WebUI.verifyElementPresent(findTestObject('flight/alamatEmail_textField'), 0)

WebUI.setText(findTestObject('flight/alamatEmail_textField'), 'auto.test@mailinator.com')

WebUI.verifyElementPresent(findTestObject('flight/nomorTelp_textField'), 0)

WebUI.setText(findTestObject('testProduct/nomorTelp_field'), '089900990099')

WebUI.scrollToElement(findTestObject('flight/asuransi_text'), 0)

WebUI.verifyElementPresent(findTestObject('flight/titel_detail_dropdown'), 0)

WebUI.click(findTestObject('flight/titel_detail_dropdown'))

WebUI.verifyElementPresent(findTestObject('testProduct/tuan_text'), 0)

WebUI.click(findTestObject('testProduct/tuan_text'))

WebUI.verifyElementPresent(findTestObject('flight/namaLengkap_detail_textField'), 0)

WebUI.setText(findTestObject('flight/namaLengkap_detail_textField'), 'Automtion Tester')

WebUI.verifyElementPresent(findTestObject('testProduct/lanjutPembayaran_btn'), 0)