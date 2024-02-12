## AMPHIBIANS

A learning project using a API to access a database of amphibians and display them. The main focus
was to structure the project in a clean and maintainable way, using coroutines, MVVM, Retrofit, 
repository pattern, Dependency Injection and Jetpack Compose.

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