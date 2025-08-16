# mobile-com-Appium
📱 Mobile Contacts Automation

Automação de testes para o aplicativo de contatos do Android utilizando Appium, Selenium e Java.

# 📝 Descrição

Este projeto automatiza o fluxo de criação de contatos em dispositivos Android, garantindo que os dados inseridos correspondam ao contato criado.


# Fluxo automatizado:

📂 Abrir o aplicativo de contatos do dispositivo.

➕ Navegar até a tela de adicionar um novo contato.

🖊️ Inserir nome, sobrenome, telefone e e-mail, e salvar o contato.

✅ Validar se os dados inseridos correspondem ao contato criado.

O projeto segue princípios de Clean Code, Orientação a Objetos e arquitetura modular para fácil manutenção.


# ⚙️ Tecnologias Utilizadas

Java 8

Appium 8.3.0

Selenium 4.19.0

JUnit 5

Maven

Android Emulator ou dispositivo real


# 📁 Estrutura do Projeto
pratica_mobile/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   ├── pages/
│       │   │   ├── AddContactPage.java
│       │   │   └── HomePage.java
│       │   ├── tests/
│       │   │   └── AddContactTest.java
│       │   └── utils/
│       │       └── DriverFactory.java
│       └── resources/



# 🚀 Como Rodar

Clone o repositório:

git clone https://github.com/TalitaSilva96/mobile-com-Appium.git


# Entre na pasta do projeto:

cd pratica_mobile


# Compile e instale as dependências:

mvn clean install


Configure o Appium e conecte seu dispositivo ou emulador.

# Execute os testes:

mvn test


# 🛠 Funcionalidades

➕ Criação de contatos no aplicativo nativo do Android.

🔍 Validação de dados inseridos.

🧩 Arquitetura modular, organizada e fácil de manter.

📌 Segue o padrão Page Object Model (POM) para manutenção simples e escalável.


# 📌 Observações

Certifique-se de que o Appium Server esteja rodando em http://127.0.0.1:4723/wd/hub.

Atualize o deviceName, appPackage e appActivity caso utilize outro dispositivo ou app de contatos.

Utilize seletores XPath, ID ou AccessibilityId para estabilidade nos testes.


# 💡 Dicas Extras

Você pode integrar GitHub Actions para rodar os testes automaticamente ao enviar commits.

Mantenha o padrão Page Object Model, garantindo que o projeto cresça sem perder organização.
