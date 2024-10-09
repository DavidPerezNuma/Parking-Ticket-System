# 🚓 Parking Ticket System

This project simulates a parking ticket system in which a police officer issues a parking ticket when a parked car has exceeded the paid parking time on the meter. The application uses several classes to represent different elements of the system (car, parking meter, ticket, and police officer), each interacting to create a realistic flow for issuing a parking violation.

## 📊 UML Class Diagram

![UML Diagram](./assets/UML%20diagram.png)

## 📂 Project Structure

The project is organized into two main directories: `src` for the main application code and `test` for automated test cases.

```plaintext
multas/
├── src/
│   ├── App.java                    # 📋 Main application file for manual testing
│   └── Model/                      # 📁 Folder containing main program classes
│       ├── CarroParqueado.java     # 🚗 Represents a parked car
│       ├── OficialDePolicia.java   # 👮 Represents the police officer issuing tickets
│       ├── Parquimetro.java        # ⏲️ Simulates a parking meter with paid time
│       └── TiqueteMulta.java       # 💸 Generates the ticket with fine details
├── test/
│   └── TestApp.java                # ✅ Contains automated test cases for the system
├── .gitignore                      # 🚫 Specifies files and folders to ignore in version control
└── README.md                       # 📖 Documentation of the project
```

## 📑 Explanation of Each File

- **App.java**: The main application file that allows manual verification of whether a parked car has exceeded its paid parking time. When run, users input values in the console, and a ticket is issued if necessary.

- **Model/CarroParqueado.java**: Class representing a parked car, containing attributes such as brand, model, color, license plate, and the number of minutes parked.

- **Model/OficialDePolicia.java**: Represents a police officer, who verifies if the car has exceeded the allowed parking time and issues the ticket if necessary.

- **Model/Parquimetro.java**: Class that simulates a parking meter, storing the paid parking time in minutes.

- **Model/TiqueteMulta.java**: Class that generates a parking ticket when a parked car exceeds its paid time. Calculates the fine based on additional unpaid parking time.

- **test/TestApp.java**: Test class that includes automated test cases to validate different scenarios:
    - Case 1: Car is within the allowed parking time (no ticket).
    - Case 2: Car exceeds parking time by less than an hour (expecting a 25,000 pesos fine).
    - Case 3: Car exceeds parking time by more than an hour (expecting a 35,000 pesos fine).

- **.gitignore**: This file contains rules to exclude files and folders from version control, which is particularly useful to avoid cluttering the repository with unnecessary files. Key entries in this `.gitignore` include:
  - **Java files**: `*.class` files and compiled JAR/WAR files.
  - **OS-specific files**: `.DS_Store` (macOS), `Thumbs.db` (Windows), temporary files, and cache files.
  - **IDE files**: `.vscode/` and `.idea/` directories for Visual Studio Code and other IDE-specific metadata.
  - **Build files**: `bin/`, `obj/`, and other build output directories, as well as log files like `*.log`.
  - **Miscellaneous**: Temporary files, backup files from merge conflicts, and cache files for faster processing in various tools.

- **README.md**: This file, providing an overview of the project, its structure, instructions for running the application and tests, and information about the project author.

## 🚀 How to Run the Project

### 🔍 Manual Testing

To manually test the application:

1. Open a terminal and navigate to the project root directory (`multas`).
2. Compile the main application and necessary classes:
   ```bash
   javac -d . src/App.java src/Model/*.java
   ```
3. Run the application:
   ```bash
   java App
   ```
4. The application will prompt for inputs related to the police officer, the car, and the parking meter. Enter the requested values, and observe the output to see if a ticket is issued or not.

### 🧪 Running Automated Tests

To run automated test cases and validate the system’s functionality:

1. Ensure you are in the project root directory (`multas`).
2. Compile the test files along with the main program classes:
   ```bash
   javac -d . src/App.java src/Model/*.java test/TestApp.java
   ```
3. Run the tests:
   ```bash
   java test.TestApp
   ```
4. The output will display the results for each test case, indicating whether the system behaves as expected in each scenario.

## 👤 Project Author

**Name**: Juan David Pérez Numa  
**📧 Email**: juperez49@unisalle.edu.co