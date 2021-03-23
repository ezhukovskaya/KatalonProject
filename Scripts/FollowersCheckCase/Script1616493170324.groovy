import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import jenkins.model.Jenkins

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def envVars = Jenkins.instance.getGlobalNodeProperties()[0 as String].getEnvVars()
expectedAmount = envVars['count']

response = WS.sendRequest(findTestObject('User/Get Followers', [('variable') : '', ('variable_0') : '', ('variable_1') : '']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'response.count', expectedAmount)

