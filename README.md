# UI автотесты для мобильного приложения<br>ТК "Энергия" (https://nrg-tk.ru/)

![TK_Energy](/img/logo/energy_logo.png)

## Cписок автоматизированных тест-кейсов в данном проекте:

- [x] Проверка доступности экрана с формой восстановления пароля  
- [x] Проверка доступности экрана с формой регистрации клиента
- [x] Проверка доступности и работы календаря на экране "Накладные"
- [x] Проверка доступности формы поиска накладной на перевозку 
- [x] Проверка доступности экрана "Настройки"
- [x] Проверка работы переключателя отправки уведомлений пользователю

## Стек технологий:

![Intelij_IDEA](/img/logo/Intelij_IDEA.png)![Java](/img/logo/Java.png)![Selenide](/img/logo/Selenide.png)![Selenoid](/img/logo/Selenoid.png)![Docker](/img/logo/Docker.png)![Browserstack](/img/logo/Browserstack.png)![Appium](/img/logo/Appium.png)![Android Studio](/img/logo/android_studio.png)![Gradle](/img/logo/Gradle.png)![JUnit5](/img/logo/JUnit5.png)![Allure Report](/img/logo/Allure_Report.png)![AllureTestOps](/img/logo/AllureTestOps.png)![Github](/img/logo/Github.png)![Jenkins](/img/logo/Jenkins.png)![RestAssured](/img/logo/Rest-Assured.png)![Telegram](/img/logo/Telegram.png)![Jira](/img/logo/Jira.png)

<b>Java, Selenide, Selenoid, Docker, Browserstack, Appium, Android Studio, Gradle, JUnit5, Allure Reports, TestOps, GitHub, Jenkins, RestAssured, Telegram (уведомления), Jira</b>
#
- В данном проекте UI автотесты написаны на <b>Java</b> с использованием фреймворка <b>Selenide</b>

- При помощи библиотеки <b>REST-Assured</b> реализована запись видео прохождения тестов.

- Для сборки проекта используется <b>Gradle</b>.

- <b>JUnit 5</b> используется как фреймворк для модульного тестирования.

- Запуск тестов выполняется из системы <b>Jenkins</b>.

- <b>Browserstack</b> используется как платформа для удаленного выполнения тестов на реальном устройстве. 

- <b>Selenoid</b> используется для запуска эмулятора мобильного устройства в контейнерах <b>Docker</b>.

- При помощи <b>Android Studio</b> и <b>Appium</b> запускаются автотесты локально (на реальном устройстве и в эмуляторе) 

- <b>Allure Report</b>, <b>Allure TestOps</b>, <b>Jira</b>, <b>Telegram Bot</b> используются для визуализации и анализа результатов тестирования.

- В качестве хостинга для данного проекта используется <b>GitHub</b>.

## Локальный запуск тестов:

### Запуск тестов из терминала с заполненными конфиг-файлами *.properties:

### Для запуска тестов в BrowserStack:

```bash
gradle clean test -DdeviceHost=browserstack
```

### Для запуска тестов в Selenoid:

```bash
gradle clean test -DdeviceHost=selenoid
```

### Для запуска тестов в эмуляторе:

```bash
gradle clean test -DdeviceHost=emulation
```

### Для запуска тестов реальном устройстве:

```bash
gradle clean test -DdeviceHost=real
```

### Запуск тестов с не заполненными конфиг-файлами *.properties:

### Для запуска тестов в BrowserStack:

```bash
gradle clean test 
 -DbrowserStackURL=http://hub.browserstack.com/wd/hub
 -DbrowserStackUsername=
 -DbrowserStackPassword=
 -Dapp=bs://78f332b3961073ba54ad56fqwqw6a2be5901ecd7fcc9"
 -DbrowserStackVideoURL=https://api-cloud.browserstack.com/app-automate/sessions/
 -Ddevice=Samsung Galaxy S9
 -DosVersion=8.0
```
#### где:

- <b>-DbrowserStackURL</b> - адрес удаленного сервера, где будут выполняться тесты 
- <b>-DbrowserStackUsername</b> - логин для входа на сервер выпонения тестов
- <b>-DbrowserStackPassword</b> - пароль для входа на сервер выпонения тестов
- <b>-Dapp</b> - адрес местонахождения apk-файла приложения, в котором будут выполняться тесты
- <b>-DbrowserStackVideoURL</b> - адрес видео прохождения тестов 
- <b>-Ddevice</b> - марка и модель устройства, на котором будут проходить тесты
- <b>-DosVersion</b> - версия операционной системы Android, на которой будут проходить тесты

### Для запуска тестов в Selenoid:

```bash
gradle clean test 
 -DselenoidUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub
 -Dusername=
 -Dpassword=
 -DvideoUrl=https://selenoid.autotests.cloud/video/
 -DdeviceName=android
 -DplatformName=Android
 -DosVersion=8.1
 -DappUrl=https://github.com/andreigkuznetsov/tkEnergyMobileTests/blob/master/src/test/resources/apk/1.44-api3-prod.apk
```
#### где:

- <b>-DselenoidUrl</b> - адрес удаленного сервера, где будут выполняться тесты 
- <b>-Dusername</b> - логин для входа на сервер выпонения тестов
- <b>-Dpassword</b> - пароль для входа на сервер выпонения тестов
- <b>-DappUrl</b> - веб-адрес местонахождения apk-файла приложения, в котором будут выполняться тесты
- <b>-DvideoUrl</b> - адрес видео прохождения тестов 
- <b>-DplatformName</b> - названия операционной системы, на котором будут проходить тесты
- <b>-DdeviceName</b> - марка и модель устройства, на котором будут проходить тесты
- <b>-DosVersion</b> - версия операционной системы Android, на которой будут проходить тесты

### Для запуска тестов в эмуляторе или на реальном устройстве:

```bash
gradle clean test 
 -DemulationServerUrl=http://127.0.0.1:4723/wd/hub
 -DplatformName=Android
 -DdeviceName="Pixel_4_API_30"
 -Dversion=11.0
 -DappUrl=src/test/resources/apk/app.apk
```
#### где:

- <b>-DemulationServerUrl</b> - адрес локального сервера, где будут выполняться тесты 
- <b>-DappUrl</b> - локальный адрес местонахождения apk-файла приложения, в котором будут выполняться тесты
- <b>-DplatformName</b> - названия операционной системы, на котором будут проходить тесты
- <b>-DdeviceName</b> - марка и модель устройства (для эмулятора), серийный номер девайса (для реального устройства) 
- <b>-DosVersion</b> - версия операционной системы Android, на которой будут проходить тесты

### Сформировать allure отчет:

```bash
allure serve build/allure-results
```

## Удаленный запуск тестов:

### Для запусков автотестов используется [Jenkins](https://jenkins.autotests.cloud/job/09-andreikuzn-tk-energy-mobile-tests/).

### Параметры сборки:

```bash
DEVICEHOST - удаленный сервис, в котором будут выполняться тесты (по умолчанию browserstack)
ENVIRONMENT - тестовый стенд, на котором будут запущены тесты (по умолчанию RC)
COMMENT - комментарий, который отображается в сообщении Телеграмм-бота (по умолчанию "app ver. 1.44-api3-prod")
```
#### Для запуска сборки необходимо нажать на кнопку "Собрать с параметрами", затем, выбрать (или оставить по умолчанию) значения параметров и нажать кнопку "Собрать".
#
![jenkins_start_window](/img/pics/jenkins_start_window.png)
#
#### Для анализа результатов запусков в Jenkins используется Allure Reports

## Описание Allure Reports:

#### После выполнения сборки, в разделе "История сборок" в строке с номером сборки появится значок Allure Report, кликнув по которому, откроется страница с сформированным отчетом по данной сборке. 
#
![allure_start_window](/img/pics/allure_start_window.png)
#
### Пример отчета о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/09-andreikuzn-tk-energy-mobile-tests/13/allure/)

#### Overview страница Allure-отчета содержит следующие разделы:

- <b>ALLURE REPORT</b> - отображает дату и время прохождения теста, общее количество прогнанных кейсов, а также диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов
- <b>TREND</b> - отображает тренд прохождения тестов от сборки к сборке
- <b>SUITES</b> - отображает распределение результатов тестов по тестовым наборам
- <b>ENVIRONMENT</b> - отображает тестовое окружение, на котором запускались тесты (в данном случае информация не задана)
- <b>CATEGORIES</b> - отображает распределение неуспешно прошедших тестов по видам дефектов
- <b>FEATURES BY STORIES</b> - отображает распределение тестов по функционалу, который они проверяют
- <b>EXECUTORS</b> - отображает исполнителя текущей сборки (ссылка на сборку в Jenkins)
#
![allure_main_window](/img/pics/allure_main_window.png)
#
#### На странице Suites представляется стандартное распределение выполнявшихся тестов по классам (тестовым наборам), в которых находятся тестовые методы (шаги).

#### Каждый тестовый набор содержит скриншот, сделанный после последнего шага, видео прохождения и консольные логи браузера.
#
![allure_overview_ui_window](/img/pics/allure_overview_ui_window.png)
#
## Интеграция с AllureTestOps:
### Для запуска автотестов, отображения и анализа результатов сборок также используется [Allure TestOps](https://allure.autotests.cloud/project/1026/dashboards)

#### Overview дашборд

![testops_overview_dashboard](/img/pics/testops_overview_dashboard.png)
#
#### Дашборд по типам тестов

![testops_automation_dashboard](/img/pics/testops_automation_dashboard.png)
#
#### Дашборд по тестовым стендам

![testops_stages_dashboard](/img/pics/testops_stages_dashboard.png)
#
#### Дашборд с аналитикой по команде

![testops_team_dashboard](/img/pics/testops_team_dashboard.png)
#
#### Результаты запусков тестовых прогонов

![testops_launches_dashboard](/img/pics/testops_launches_dashboard.png)
#
#### Страница с test-планами

![testops_testplans_dashboard](/img/pics/testops_testplans_dashboard.png)
#
#### Пример списка тестов и их прохождения

![testops_cases_dashboard](/img/pics/testops_cases_dashboard.png)
#
## Интеграция с Jira:
### Запускаемые кейсы и их результаты можно добавить в [Jira](https://jira.autotests.cloud/browse/HOMEWORK-338)

<p align="left">
<img src="/img/pics/jira_issue_338.png">
</p>

## Интеграция с Telegram:
### После прохождения тестов, в telegram канал приходит оповещение с результами

<p align="left">
  <img src="/img/pics/telegram_results_1.jpg" alt="Telegram" width="400">
  <img src="/img/pics/telegram_results_2.jpg" alt="Telegram" width="365">
</p>

## Пример запуска и прохождения теста на видео: 

![video_test](/img/pics/video_test.gif)
