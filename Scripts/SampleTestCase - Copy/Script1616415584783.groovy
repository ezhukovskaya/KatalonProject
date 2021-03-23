import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

not_run:WebUI.maximizeWindow()

WebUI.navigateToUrl('https://vk.com/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  VK/input_Forgot your password_email'), '375292397596')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  VK/input_Forgot your password_pass'), 'bzgN4bj9/kEp3svG43OjtD/ln8RdJURh')

WebUI.click(findTestObject('Page_Welcome  VK/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_News/svg'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_News/a_Sign out'), 0)

WebUI.click(findTestObject('Object Repository/Page_News/a_Sign out'))

WebUI.closeBrowser() 

