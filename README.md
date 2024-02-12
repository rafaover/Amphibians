## AMPHIBIANS

A solo project for learning purposes using an API to access a list of amphibians for display. The main focus
was to structure the project in a clean and maintainable way, using coroutines, MVVM, Retrofit, 
repository pattern, Dependency Injection and Jetpack Compose.

<img src="https://github.com/rafaover/Amphibians/assets/59352318/29562576-3a5f-4b9e-846b-236858b7edc7" height="500">

## TECHNOLOGIES AND DEPENDENCIES

**Language:** Kotlin

**UI Framework:** Jetpack Compose

**Network Requests:** Retrofit

**Concurrency:** Coroutines

**MVVM:** ViewModel with MutableStateOf. 
Holds the UI-related data and logic and is responsible for managing the state of the UI.

**Repository Pattern:** Data acquisition from Retrofit is abstracted into a separate repository. 
This pattern provides a clean separation between data sources and the rest of the application.

**Dependency Injection(Container):** Holds dependencies, including Retrofit logic and service.
This helps in managing and providing dependencies throughout the application in a structured manner.

**Serialization:** Kotlin Serialization. Used for parsing JSON data.

**Image Loading:** Coil.
