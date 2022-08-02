Today I am Writing a blog of ‘Alarm Manager API’. This Software application running on the Android Platform Use Java Language. This Application We are 
show three feature. Alarm Manager class basically use for the system alarm Services. This class make a schedule of Android Application to be run at some 
point int the future. And it is user dependency. User can stop any time and user can modify it according to his own.

Alarm Manager class is most feature is ‘Set Alarm’. Basically it use of many way . Now We discuss of only two type of alarm. Set Alarm And Schedule 
Alarm. Before start the set alarm , we need to proper understand  Android studio and there feature.

Android Studio provides a integrated environment where we can make app for android, phones, tablets, Android Tv etc. Structured code modules allow
to divide our project into units of functionality that we can independently build, test and debug.

    Use Process: When we open a folder about android studio Then come 4 ready folder. In this project we will use only 2 folder i. Java Folder , 
    ii. Res folder. Java folder we will write all logical condition and res folder we will  open Layout folder. This folder use for all design 
    paten and this is a xml file. Now we are ready to make the Android App development. 

Now I am discuss the project I will be doing on  Alarm Manager. First of all I will make a home page. From this homepage we will go to set Alarm
page and Schedule Alarm Page. Then set the alarm and when alarm start It will be Vibrate. And user can cancel the Vibrate. 


Home Page: This page I will make two button i. Set Alarm , ii. Schedule Alarm . First we are going design page (res->layouts) and create a xml
 file. After open the file It comes two option one is design button and another is code button . First we click of design button .Take the two 
button and  dropdown the page. Then click the code button and the button stretcher will there. You need to just write the id of two button. After 
finish the xml file work the we are going to java page. This page we create the function and use the button id to identify the function . This 
function we redirect to Set alarm page and Schedule Alarm page. 

Now I am discuss the after next part is Set Alarm . Alarm means to set the time at which the alarm in a phone or alarm clock will ring. This alarm
is very helpful for keeping sleep schedules regular, For fixed time Waking up around . any short play game we use Set Alarm.

This project we make a set alarm very easily. First all we discuss our feature. Set alarm  I make vibration we alarm are set, after that make a toast
message , and last feature is cancel the alarm system . 

Now starting our project , First of all we are going to the java folder. First create a new Activity of Set alarm (Procedure: Java folder => 
com.example.mehedi=>(Right click)=> New=> Activity => Empty Activity Select) then open the java folder. After the create the new (xml file) . 
This xml we use 3 design tool. 1. TextView 2. Button  3. TextView. Every  design tool use the id to identify the every design . 

Now we are going to java folder this folder we use logic part . this folder we use “findViewById” to select the button id. And make the function 
of this Id. This function we are implicate all the logic part

	Toaster : toaster is  basically use for message. When you set the time then click the ok button then show the message for user. It is user 
		  conformation message 
	Cancel button : cancel button use when user do not want to select the time and they come to home page.
	Use Alarm : This is main part to setup the alarm. “Alammanager “ is a function this function is use for all logic . 

		“alarmManager.set(AlarmManager, RTC_WAKEUP, triggerTime, PendingIntent)
	         then next part is to write the logic of  ringtone .Now i am going to java folder to make the new empty java file . this file is extend 
		of BroadcastReceiver. “MediaPlayer” is a function to develop to use of ringtone.  
Now I am discuss of the Schedule alarm . this alarm give a way to perform time-based operation outside the lifetime. This type of alarm are use for 
initiate a long-running operation, morning Alarm, any time management alarm , routine alarm and many option to use this schedule alarm . 

Now we are implication of schedule alarm . the same feature we are use of schedule alarm . but there input type of time is different. 
Scheduler alarm we are use of feature are to select the time of timepicker, cancle the alarm , make the toast of this scheduler algorithm. 

After the set alarm we are start the schedule alarm so we are not again the discuss of file format . So First of all we are create the one 
file in java extension. This java file we are use for scheduler alarm logic code . and then again go to the res folder and make the xml 
file to use design patent. Now First of all I am discuss of Time Picker.

	Time picker is use for when user don’t want to write of the time then we use timepicker. TimePicker is like a watch . user use the timepicker
	 to touch . Now I am give you to  time picker code . Use XML file
	<TimePicker
	Android:id=”…”
	Android:layout_width=”warp_content”
	Android:layout_height=”warp_content”
	/>
And there Logic part as same of normal time alarm . 
	Now we use for button . this button is use to confirm the set alarm. This id button we use for java file and make the function . this function
		 we write the all code because when we click the button all of work need to complete . 
	Toast : toaster is  basically use for message. When you set the time then click the ok button then show the message for user. It is user 
		conformation message 
	This is main part to setup the alarm. “Alammanager “ is a function this function is use for all logic . 
		“alarmManager.set(AlarmManager, RTC_WAKEUP, triggerTime, PendingIntent)
then next part is to write the logic of  ringtone .Now i am going to java folder to make the new empty java file . this file is extend of BroadcastReceiver. 
“MediaPlayer” is a function to develop to use of ringtone. If we need to use sensor or need to use notification to use the same function . 

	Cancel button: This button use for the cancel the alarm . The rule of this cancel button is just call the function and this function use for empty . 
	After the a

After the all full fill the step we create a Alarm . now this is user for friendly but there are no cancel page . That means when Start the alarm it need to 
stop the alarm. Otherwise is can not be good perform from user. 

Now we are going to make of cancel Page . so that the user does not become a cause of annoyance. 
First of all we need a textarea if user can understand why this page comes. Then make a button to cancel the alarm . 
	TextArea is use for message . 
	Cancle button : When alarm will starting to stop the alarm . firstly we manage the time . when click the cancle button the forword the time and 
	set the update time so easyly stop the alarm Now Softw. 
Now Software is fully ready to use . this alarm system are use for many  system . In the medical , play , exam time, home, defense and many other way to use
 the system.  








	