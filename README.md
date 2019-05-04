                                        FACE DETECTION APP
                              Android application using Microsoft Azure cognitive Services

As per my previous blog related to Azure Cognitive Services, I have extended this article with practical example using Microsoft Azure vision API for Face detection. I have developed a simple application in Android. Which helps to detect user face from an image and can able to tell person’s Age, Gender and if person wears glasses or not. 
On technical note, I have used Picasso to load the image from url as third party library. Firebase storage is used to store the uploaded image. Upload image’s api is called which upload the image to the firebase.
There is Getdata method that is called to get the face characteristics as mentioned like, Age, Gender and Glasses. The code can also detect the face in pic and draw rectangle outside it in red color line

  			 

This is the opening screen in the app. In this we have two buttons choose and upload. We can choose the image from the gallery and then uploading it will use the firebase storage. After successful uploading of the image the activity will move to the next screen. The image will also be seen on the imageview in this screen.
We should have azure subscription for generating subscription key for Face API, you can get Microsoft Azure free account from here. 
 
Here the Microsoft azure api  is called, if the response is 200 i.e ok then in the textview (light blue) the gender, age and glasses will get displayed, from the respective responses.
I have also added a toast if there is no face detected in the pic, it will have when we have IndexOutofBoundException. Which states that no face is detected in the pic.
Please find the source code from my git repo.
Pre-Requisites:
1.	Android studio
2.	Firebase storage account
3.	Microsoft Azure Subscription

