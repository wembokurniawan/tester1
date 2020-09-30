import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Common {

	@Given("The tiket page is loaded successfully")
	def openTiketPage() {
//		WebUI.callTestCase(findTestCase('Test Cases/common/The Calculator page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.openBrowser(GlobalVariable.tiketURL)
		WebUI.maximizeWindow()
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/tiketLogo_image'), 0)
	}
	
	@When("I click hotel menu bar")
	def hotelMenu() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/hotel_menuBar_btn'), 0)
		WebUI.click(findTestObject('Object Repository/testProduct/hotel_menuBar_btn'))
		WebUI.delay(2)
	}
	
	@Then("I input destination")
	def inputDestinationAndFindHotel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/destinationInput_textField'), 0)
		WebUI.click(findTestObject('Object Repository/testProduct/destinationInput_textField'))
		WebUI.setText(findTestObject('Object Repository/testProduct/destinationInput_textField'), 'Bali')
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/firstList_destinationList_text'), 0)
		WebUI.click(findTestObject('Object Repository/testProduct/firstList_destinationList_text'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/testProduct/close_tanggal_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/cariHotel_btn'), 0)
		WebUI.click(findTestObject('testProduct/cariHotel_btn'))
	}
	
	@Then("Select first hotel also first room")
	def selectFirstHotelAlsoRoom() {
		WebUI.verifyElementPresent(findTestObject('testProduct/first_HotelList_text'), 0)
		WebUI.click(findTestObject('testProduct/first_HotelList_text'))
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/tiketLogo_image'), 0)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('testProduct/hotelDetail_btn'), 0)
		WebUI.verifyElementPresent(findTestObject('testProduct/pesanSekarang_btn'), 0)
		WebUI.click(findTestObject('testProduct/pesanSekarang_btn'))
	}
	
	@Then("Login with facebook account")
	def loginWithFacebook() {
		WebUI.verifyElementPresent(findTestObject('testProduct/Login_btn'), 0)
		WebUI.click(findTestObject('testProduct/Login_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/masukDenganFacebook_btn'), 0)
		WebUI.click(findTestObject('testProduct/masukDenganFacebook_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/email_fb_txtField'), 0)
		WebUI.setText(findTestObject('testProduct/email_fb_txtField'), '')
		WebUI.verifyElementPresent(findTestObject('testProduct/pass_fb_txtField'), 0)
		WebUI.setText(findTestObject('testProduct/pass_fb_txtField'), '')
		WebUI.verifyElementPresent(findTestObject('testProduct/login_fb_btn'), 0)
		WebUI.click(findTestObject('testProduct/login_fb_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/lanjutkanSebagai_btn'), 0)
		WebUI.click(findTestObject('testProduct/lanjutkanSebagai_btn'))
		WebUI.delay(10)
	}
	
	@Then("input detail pemesanan page")
	def detailPemesananPage() {
		WebUI.verifyElementPresent(findTestObject('testProduct/detailPemesanan_text'), 0)
		WebUI.verifyElementPresent(findTestObject('testProduct/title_dropdown'), 0)
		WebUI.click(findTestObject('testProduct/title_dropdown'))
		WebUI.verifyElementPresent(findTestObject('testProduct/tuan_text'), 0)
		WebUI.click(findTestObject('testProduct/tuan_text'))
		WebUI.verifyElementPresent(findTestObject('testProduct/nomorTelp_field'), 0)
		WebUI.setText(findTestObject('testProduct/nomorTelp_field'), '')
		WebUI.verifyElementPresent(findTestObject('testProduct/title_detail_dropdown'), 0)
		WebUI.click(findTestObject('testProduct/title_detail_dropdown'))
		WebUI.verifyElementPresent(findTestObject('testProduct/tuan_text'), 0)
		WebUI.click(findTestObject('testProduct/tuan_text'))
		WebUI.verifyElementPresent(findTestObject('testProduct/lanjutPembayaran_btn'), 0)
	}

	@Then("Close the browser")
	def close_browser() {
		WebUI.closeBrowser()
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	@When("I click pesawat menu bar")
	def pesawatMenuBar() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/testProduct/pesawat_menuBar'), 0)
		WebUI.click(findTestObject('Object Repository/testProduct/pesawat_menuBar'))
		WebUI.delay(2)
	}
	
	@Then("I input destination flight")
	def inputDestinationFlight() {
		WebUI.verifyElementPresent(findTestObject('flight/flightFrom_textfield'), 0)
		WebUI.click(findTestObject('flight/flightFrom_textfield'))
		WebUI.verifyElementPresent(findTestObject('flight/jakarta_text'), 0)
		WebUI.click(findTestObject('flight/jakarta_text'))
		WebUI.verifyElementPresent(findTestObject('flight/flightTo_textField'), 0)
		WebUI.setText(findTestObject('flight/flightTo_textField'), 'Surabaya')
		WebUI.verifyElementPresent(findTestObject('flight/surabaya_text'), 0)
		WebUI.click(findTestObject('flight/surabaya_text'))
		WebUI.verifyElementPresent(findTestObject('flight/x_close_dateBtn'), 0)
		WebUI.click(findTestObject('flight/x_close_dateBtn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/cariPenerbangan_btn'), 0)
		WebUI.click(findTestObject('testProduct/cariPenerbangan_btn'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('flight/mengerti_btn'), 0)
		WebUI.click(findTestObject('flight/mengerti_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/pilihPenerbanganPergi_text'), 0)
		WebUI.verifyElementPresent(findTestObject('testProduct/langsung_checkBox'), 0)
		WebUI.click(findTestObject('testProduct/langsung_checkBox'))
		WebUI.verifyElementPresent(findTestObject('testProduct/pilih_btn'), 0)
		WebUI.click(findTestObject('testProduct/pilih_btn'))
		WebUI.verifyElementPresent(findTestObject('testProduct/okMenegerti_btn'), 0)
		WebUI.click(findTestObject('testProduct/okMenegerti_btn'))
	}
	
	@Then("input detail pemesanan flight page")
	def detailPemesananFlightPage() {
	}

	@Then("I get the result (.*)")
	def check_result(String result) {
		WebUI.callTestCase(findTestCase('Test Cases/common/Check result'), [ ('result') : result ], FailureHandling.STOP_ON_FAILURE)
	}
}