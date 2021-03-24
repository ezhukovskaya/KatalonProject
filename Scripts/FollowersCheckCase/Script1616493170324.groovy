import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject



response = WS.sendRequest(findTestObject('User/Get Followers', [('variable') : '', ('variable_0') : '', ('variable_1') : '']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'response.count', 39989)

