set projectLocation=D:\Akhila\javaworkspace\Automationpractice

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause