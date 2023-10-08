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

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/a_Leave'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/div_Entitlement'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/a_Add Entitlements'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Apply Leave/Page_OrangeHRM/Input_Entitlements_Employee_Name'), 'ilham')

WebUI.delay(3)

WebUI.click(findTestObject('Newuser/Page_OrangeHRM/div_select_ilhamsp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/DDL_LeaveType'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/DDL_leave_can_bereavement'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Apply Leave/Page_OrangeHRM/input_entitlement'), '12')

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/button_save_entitlement'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Apply Leave/Page_OrangeHRM/button_confrim_entitlement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.delay(2)

