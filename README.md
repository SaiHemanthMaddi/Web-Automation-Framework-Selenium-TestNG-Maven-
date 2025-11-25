📘 Web Automation Framework (Selenium + TestNG + Maven)

A lightweight, scalable, and production-ready Web UI Automation Framework built using
Java · Selenium WebDriver · TestNG · Maven · Extent Reports · GitHub Actions CI.

This framework follows industry-standard best practices and is designed for:

🔹 UI Functional Testing

🔹 Cross-browser Testing

🔹 CI/CD Integration

🔹 Reusable Page Object Model (POM)

🔹 Reporting with Extent Reports

🔹 Screenshot Capture on Failure

🚀 Tech Stack
Component	Technology
Language	Java 17+
Automation	Selenium WebDriver 4.x
Test Runner	TestNG
Build Tool	Maven
Reporting	Extent Reports (aventstack)
Design Pattern	Page Object Model (POM)
CI/CD	GitHub Actions
Logging	SLF4J + Logback
📁 Project Structure
web_automation_framework
│
├── src
│   ├── main
│   │   └── java/com/example/automation/framework
│   │       ├── pages/
│   │       ├── utils/
│   │       ├── reporting/
│   │       └── DriverManager.java
│   │
│   └── test
│       └── java/tests
│           └── LoginTest.java
│
├── reports/               # Extent Reports output with timestamp
├── screenshots/           # Failure screenshots
├── .github/workflows/     # CI pipeline
├── testng.xml
├── pom.xml
└── README.md

⚙️ Features
✔ Page Object Model (POM)

Reusable and maintainable page classes for clean test code.

✔ Centralized Driver Management

A single place for browser initialization, teardown, and setup.

✔ Explicit Wait Wrapper

Custom WaitHelper for stable tests.

✔ Extent Reports (HTML)

Auto-generated timestamped reports saved in /reports.

✔ Screenshots on Failure

Listener automatically attaches screenshot to Extent report.

✔ Logging (SLF4J)

Debug + info logs for easier debugging.

✔ CI/CD with GitHub Actions

Every push automatically runs:

mvn clean test


on GitHub’s Ubuntu runner with Chrome installed.

▶️ How to Run Tests
1️⃣ Clone the repo
git clone https://github.com/your-username/web_automation_framework.git

2️⃣ Navigate into the project
cd web_automation_framework

3️⃣ Run tests
mvn clean test

4️⃣ Reports generated at
/reports/AutomationReport-<timestamp>.html
/screenshots/<testname>.png

🧪 Sample Test (LoginTest)
@Test
public void testLogin() {
LoginPage login = new LoginPage();
InventoryPage home = login.login("standard_user", "secret_sauce");
Assert.assertTrue(home.isLoaded(), "Home page did not load!");
}

🤖 GitHub Actions CI Pipeline

Auto-triggered on every push:

Installs Java 17

Installs Chrome + ChromeDriver

Runs Maven tests

Uploads reports as artifacts

Workflow file:

.github/workflows/ci.yml

📸 Screenshots & Reporting

Screenshots on every test failure

Attached automatically to Extent Report

Timestamped HTML report generated

📦 Dependencies (Maven)

Includes:

selenium-java

testng

extentreports

slf4j + logback

webdrivermanager

🙌 Contributions

Feel free to fork the repo and submit a PR.