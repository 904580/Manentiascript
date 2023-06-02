Feature: ContactUs Functionalities

@smoke
Scenario: Verify the Contactus Functionality

Given Launch the browser
When Click on the contact us
And Enter the name
And Enter the Phone number
And Enter Email Address
And Enter the subject 
And enter the message
Then click on the send button

