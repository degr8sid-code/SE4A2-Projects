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


		

