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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon.com. Spend less. Smile more/a_Hello, sign in  Account  Lists'))

WebUI.click(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Registration/input_Your name_customerName'), 'PRIYA')

WebUI.setText(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Registration/input_US 1_email'), 'priya.chiriki@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Registration/input_Password_password'), '2zpVazmuzIo=')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Registration/input_Re-enter password_passwordCheck'), 
    '2zpVazmuzIo=')

WebUI.click(findTestObject('Object Repository/RegisteringNewUser/Page_Amazon Registration/input_Passwords must match_continue'))

WebUI.closeBrowser()

