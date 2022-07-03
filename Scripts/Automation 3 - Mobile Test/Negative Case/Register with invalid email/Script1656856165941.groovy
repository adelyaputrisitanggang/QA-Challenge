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

Mobile.startApplication('C:\\Users\\rvl12\\git\\QA-Challenge\\Apps\\Sample Android App Login Test.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.TextView - No account yet Create one'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText'), 'Adelya', 0)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText (1)'), 'cyliedevesh66574', 0)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText (2)'), 'password12345', 0)

Mobile.setText(findTestObject('Object Repository/Mobile Test/android.widget.EditText (3)'), 'password12345', 0)

Mobile.scrollToText('REGISTER', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Mobile Test/android.widget.Button - REGISTER'), 0)

Mobile.verifyElementExist(findTestObject('Mobile Test/android.widget.TextView - Enter Valid Email'), 0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

