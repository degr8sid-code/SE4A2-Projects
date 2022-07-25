# OS-Project
4th semester project

sudo apt upgrade //upgrade current system if possible


![Screenshot from 2022-07-04 19-57-57](https://user-images.githubusercontent.com/76394467/179286695-4506f311-67de-45bd-b293-1d8865a11f53.png)


     seting up java
sudo apt-get install openjdk-8-jdk ///install jdk for java files compilation


![Screenshot from 2022-07-04 19-58-29](https://user-images.githubusercontent.com/76394467/179286742-650556bf-28af-4239-a839-2c58d22f0607.png)


after that check java version
java -version


![Screenshot from 2022-07-04 19-59-14](https://user-images.githubusercontent.com/76394467/179286804-882a9006-dd57-4933-87e3-77c0f23df71d.png)


     setting Jenkins
wget -q -O - https://phg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add- 


![Screenshot from 2022-07-04 19-59-31](https://user-images.githubusercontent.com/76394467/179286873-38d14043-3e54-451d-9a0c-051eb4cca56a.png)


sudo sh -c 'echo deb [signed-by=/usr/share/keyrings/jenkins.gpg] http://pkg.jenkins.io/debian-stable b
![Screenshot from 2022-07-04 19-59-46](https://user-images.githubusercontent.com/76394467/179286906-86c750ac-9c9a-4f0f-b0b9-9ed31a6af7a2.png)
inary/ > /etc/apt/sources.list.d/jenkins.list'

if terminal shows "OK"
then update your system
sudo apt update // update system


![Screenshot from 2022-07-04 19-59-46](https://user-images.githubusercontent.com/76394467/179287034-5be4201d-e88b-4342-9449-1fc63ce1a7cb.png)

sudo apt install jenkins//install jenkins


![Screenshot from 2022-07-04 19-59-58](https://user-images.githubusercontent.com/76394467/179287054-20280ea2-b28a-4dbb-8dbb-3c6d832e0be4.png)


sudo systemctl start jenkins.service //run this command start jenkins on your system


![Screenshot from 2022-07-04 20-00-29](https://user-images.githubusercontent.com/76394467/179287226-daf2a0e9-be22-4cbf-b74e-4d54b82d203b.png)


	setting  git
sudo apt install git //install git 


![Screenshot from 2022-07-04 20-00-06](https://user-images.githubusercontent.com/76394467/179287348-20134826-29df-4ae3-a512-be2edb1b2d9c.png)

		Environment set
go to your path where project is ketp
git init //initiate git 


![Screenshot from 2022-07-13 19-25-34](https://user-images.githubusercontent.com/76394467/179287389-c3cddfd6-501f-4eaf-91ed-07230e01e994.png)


and then commit all files after config git hub with your github account


![Screenshot from 2022-07-13 19-28-55](https://user-images.githubusercontent.com/76394467/179287450-df8a5dd3-b73a-456f-8780-3a1e03fe6f5d.png)


![Screenshot from 2022-07-13 19-29-04](https://user-images.githubusercontent.com/76394467/179287479-718e2ffd-8d8f-4c87-a564-a2abee5b740c.png)


git add .//commit files in current directory


	setting jenkink

for enable jenkins on your system
		
![Screenshot from 2022-07-17 00-07-28](https://user-images.githubusercontent.com/76394467/179368911-917d7d40-16ff-4e76-b2fc-576d19853810.png)

for view status

![Screenshot from 2022-07-17 00-07-45](https://user-images.githubusercontent.com/76394467/179368926-635af261-3a41-4670-b998-bb40b93f9bd9.png)

after enable open your browser in your system and go to "http://localhost:8080/" for jennkins login page (signuo if you dont have account ,just like any other socail media sites or github)
here i hava my account and login with my username and password


![Screenshot from 2022-07-17 00-08-35](https://user-images.githubusercontent.com/76394467/179369022-03c22f5b-379c-4ad1-a319-044d39a0b83e.png)

create a job with your desired name and choose freestyle project 

![Screenshot from 2022-07-17 00-15-48](https://user-images.githubusercontent.com/76394467/179369071-4880e631-6866-41dd-ba22-f1941ab33760.png)

now choose github and add your repositry link


![Screenshot from 2022-07-17 00-17-18](https://user-images.githubusercontent.com/76394467/179369102-55c05f80-4496-48ae-8329-5732eb57d59f.png)

choose git in "Source Code Management" portion and copy the link where you have uploaded your project files ,for link click on "Code" and chooise  HTTps link and copy 


![Screenshot from 2022-07-17 00-19-04](https://user-images.githubusercontent.com/76394467/179369186-d61f47fe-b143-481a-acfd-5d6f738f6c4c.png)


write your branch name 


![Screenshot from 2022-07-17 00-21-38](https://user-images.githubusercontent.com/76394467/179369198-019637d4-cfd0-4b18-9bde-367115cb6c89.png)


click on "GitHub hook trigger for GITScm polling" check box in "Build Triggers" 


![Screenshot from 2022-07-17 00-22-17](https://user-images.githubusercontent.com/76394467/179369238-7a806456-72b6-4190-8934-767158c9a4b9.png)


write the code here in shell which will your write in your terminal to run your java program


![Screenshot from 2022-07-17 00-23-39](https://user-images.githubusercontent.com/76394467/179369274-213da63d-1e8b-4f40-b601-e4817d2001c3.png)

Finally click Appy and save 

go to dashboard and choose your job and  build yor project


![Screenshot from 2022-07-17 00-25-51](https://user-images.githubusercontent.com/76394467/179369312-8a3f22d0-9e6c-4391-90ce-e5408a792114.png)

you can view your result in build truend and on the console your output will be there.
Here you have finshed your task !

But in my case ,i am facing some error


![Screenshot from 2022-07-17 00-26-52](https://user-images.githubusercontent.com/76394467/179369363-c32d1629-a63f-4490-ae78-fbda47bcda6a.png)


![Screenshot from 2022-07-17 00-27-00](https://user-images.githubusercontent.com/76394467/179369368-3d4d7295-20f8-4d67-898d-fbf23c20630a.png)


Beacuse of this i am running my program on terminal


![image](https://user-images.githubusercontent.com/76394467/179369455-e027c803-6111-47af-a880-d31d362ee36e.png)


![image](https://user-images.githubusercontent.com/76394467/179369467-ee01e006-5560-4561-b82a-d8f14f485a64.png)


Thankyou for reading !

