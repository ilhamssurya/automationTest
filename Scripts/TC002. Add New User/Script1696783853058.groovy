import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC001. Login'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
//
//WebUI.setText(findTestObject('Object Repository/Newuser/Page_OrangeHRM/input_Username_username'), 'Admin')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Newuser/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
//
//WebUI.click(findTestObject('Object Repository/Newuser/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Newuser/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Newuser/Page_OrangeHRM/li_Add Employee'))

WebUI.setText(findTestObject('Newuser/Page_OrangeHRM/input_Employee Full Name_firstName'), 'ilham')

WebUI.setText(findTestObject('Object Repository/Newuser/Page_OrangeHRM/input_Employee Full Name_middleName'), 's')

WebUI.setText(findTestObject('Object Repository/Newuser/Page_OrangeHRM/input_Employee Full Name_lastName'), 'p')

WebUI.click(findTestObject('Newuser/Page_OrangeHRM/btn_activelogin'))

WebUI.setText(findTestObject('Object Repository/Newuser/Page_OrangeHRM/input_Username'), 'ilhamsp')

WebUI.setText(findTestObject('Newuser/Page_OrangeHRM/Input_Login_password'), 'ilhamsp1')

WebUI.setText(findTestObject('Newuser/Page_OrangeHRM/Input_Login_password_Confrim'), 'ilhamsp1')

WebUI.click(findTestObject('Newuser/Page_OrangeHRM/btn_Submit'), FailureHandling.STOP_ON_FAILURE)

