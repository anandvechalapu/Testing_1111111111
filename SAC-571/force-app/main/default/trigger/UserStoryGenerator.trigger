trigger UserStoryTrigger on User_Story__c (after insert) { 
  List<String> requiredDetails = new List<String>();
  for(User_Story__c userStory : Trigger.new) {
    //Get the required details from the user story
    requiredDetails.add(userStory.Required_Detail_1__c);
    requiredDetails.add(userStory.Required_Detail_2__c);
    requiredDetails.add(userStory.Required_Detail_3__c);
  }
  //Generate .NET code from the required details
  Generate.netCode(requiredDetails);
}