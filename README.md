<h1>Добро пожаловать!</br> 

# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Мои инструменты и технологии](#MyToolsAndTechnologies)
+ [✍Описаниe](#Description)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)
+ [🎯Проект](#Project)
+ [👷‍♂️ Сборка в Jenkins](#Build_in_Jenkins)
+ [🖥 Запуск из терминала](#terminal)
+ [:chart_with_downwards_trend: Allure отчет](#Allure_report)
    + [Главный экран отчета](#Allure_report1)
    + [Страница с проведенными тестами](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Страница с тестами в TestOps](#ManualTest)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)

<a name="MyToolsAndTechnologies"><h2>:trophy: Мои инструменты и технологии</h2></a>
<p  align="center">

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>
</br>

<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
 
 <a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a>
 
 :clipboard:Проверка наличия вакансии тестировщик <a href = "https://rockits.ru/#rec356213932">со знанием Java </br>
 
 :speech_balloon: Открытие и проверка страницы<a href = "https://school.rockits.ru/it-recruiter-course"> IT-рекрутер</br>
 
 :clipboard:Проверка формы отправки  <a href = "https://rockits.ru/#rec356687626">контактных данных</a></br>

🔎 Поиск на сайте Rokit! <a href = "https://rockits.ru/blog?search=qa&slice=1&searchtarget=null">по запросу "QA"</a>
и проверка содержимого страницы</br>
 
 🔎: Проверка страницы <a href = "https://rockits.ru/privacy-policy">Политика конфиденциальности</a>
 </br>
 
 <a name="Project"><h2>Проект</h2></a>
 <code><a href="https://rockits.ru/#rec356687626"><img src="/design/icons/rokits.jpeg" width="60"></a></code>Проект по автоматизации тестирования для <a target="_blank" href="https://rockits.ru/#rec356687626">Rockits!</a> — агенство IT-рекрутинга.
 :star2:
 
 <a name="Build_in_Jenkins" href="https://jenkins.autotests.cloud/job/Rockit"><h2>👷‍♂️ Сборки в [Jenkins]()<h2></a>

![image](https://github.com/DandieKYT/Rokits-/assets/75677738/f187311a-5509-4cb4-ad90-fe45e6f83811)


<a name="terminal"><h2>:computer: Запуск из терминала</h2></a>
Удаленный запуск:

```

clean test

```
Локальный запуск:

```

./gradlew clean test

```
<a name="Allure_report"><h2>:chart_with_downwards_trend: Allure </a><a href="https://jenkins.autotests.cloud/job/Rockit/2/allure/#">отчет</a></h2>

- <a name="Allure_report1"><h3>Главный экран отчета</h3></a>

![image](https://github.com/DandieKYT/Rokits-/assets/75677738/36cb2d92-b446-46c1-a850-cfda9427cff9)



-  <a name="Allure_report2"><h3>Страница с проведенными тестами</h3></a>

![image](https://github.com/DandieKYT/Rokits-/assets/75677738/f2d7385c-13fa-4628-87e2-64643e07a7fc)


    
<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с Allure TestOps</h2></a>
    
   
 <a name="ManualTest"><h3>Страница с тестами в TestOps</h3></a>
    
    

![Screenshot_9](https://github.com/DandieKYT/Lanit/assets/75677738/c97af6e8-5639-4d45-bc06-a2fce5736937)



<a name="Telegram"><h2>:iphone: Отчет в Telegram</h2></a>

![image](https://github.com/DandieKYT/Rokits-/assets/75677738/e3c3a4a4-3301-4994-85aa-9319b9759f3b)




<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через selenoid</h3></a>
    <h1><a href="https://selenoid.autotests.cloud/video/b6d94c7b2570e5be40d166c0baa666e5.mp4">Test suite<br>
  

https://github.com/DandieKYT/Rokits-/assets/75677738/0e750bdd-3277-4ed1-a3a3-ab905ae4ddd7




