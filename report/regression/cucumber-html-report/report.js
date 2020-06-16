$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature");
formatter.feature({
  "name": "Verify different GET operation using Rest-Assured",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Perform POST request to create new list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Debug"
    }
  ]
});
formatter.step({
  "name": "I perform POST operation for \"/list\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_perform_POST_operation_for(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class org.codehaus.groovy.reflection.ReflectionCache\r\n\tat org.codehaus.groovy.runtime.dgmimpl.NumberNumberMetaMethod.\u003cclinit\u003e(NumberNumberMetaMethod.java:33)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.createMetaMethodFromClass(MetaClassRegistryImpl.java:258)\r\n\tat org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.\u003cinit\u003e(MetaClassRegistryImpl.java:111)\r\n\tat org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.\u003cinit\u003e(MetaClassRegistryImpl.java:86)\r\n\tat groovy.lang.GroovySystem.\u003cclinit\u003e(GroovySystem.java:36)\r\n\tat org.codehaus.groovy.runtime.InvokerHelper.\u003cclinit\u003e(InvokerHelper.java:86)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.createMap(ScriptBytecodeAdapter.java:635)\r\n\tat io.restassured.internal.ResponseParserRegistrar.\u003cinit\u003e(ResponseParserRegistrar.groovy)\r\n\tat io.restassured.RestAssured.\u003cclinit\u003e(RestAssured.java:347)\r\n\tat io.restassured.builder.RequestSpecBuilder.\u003cinit\u003e(RequestSpecBuilder.java:79)\r\n\tat genericLib.Utility.\u003cclinit\u003e(Utility.java:18)\r\n\tat step_definitions.Steps_Common.i_perform_POST_operation_for(Steps_Common.java:18)\r\n\tat ✽.I perform POST operation for \"/list\"(file:///E:/Benz/api-automation-restassured-master/ev-services-testsuite/src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see status code \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see message \"The item/record was created successfully.\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_message_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Perform GET request on List",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Debug"
    }
  ]
});
formatter.step({
  "name": "I perform GET operation for \"/list\" with list id \"145550\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_perform_GET_operation_for_with_list_id(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class genericLib.Utility\r\n\tat step_definitions.Steps_Common.i_perform_GET_operation_for_with_list_id(Steps_Common.java:36)\r\n\tat ✽.I perform GET operation for \"/list\" with list id \"145550\"(file:///E:/Benz/api-automation-restassured-master/ev-services-testsuite/src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see status code \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see \"145550\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Perform POST request on List to add items",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I perform POST operation for \"/list/ListID/items\" with list id \"145550\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see status code \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see message \"Success.\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_message_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Perform GET request on List to clear items",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I perform GET operation for \"/list/145550/clear\" with list id \"145550\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_perform_GET_operation_for_with_list_id(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class genericLib.Utility\r\n\tat step_definitions.Steps_Common.i_perform_GET_operation_for_with_list_id(Steps_Common.java:36)\r\n\tat ✽.I perform GET operation for \"/list/145550/clear\" with list id \"145550\"(file:///E:/Benz/api-automation-restassured-master/ev-services-testsuite/src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see status code \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see message \"Success.\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_message_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});