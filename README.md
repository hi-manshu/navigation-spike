### Multi Module Navigation using Compose.

Modules: 
- navigator (Module handling all navigation stuff)
- first-module (Feature module)
- second-module (Feature module)
- app (The Application module)

#### Navigator
- Contains all the route for composables. Same can be used to also add multiple arguments and deeplinks for the same composables.

#### App Module
- Contains the MainActivity
- NavigationManager maps the Destination to Composable and register to destinations

#### Feature modules
- It has a dummy composable with ViewModels injected via Hilt
- ViewModels are responsible for handling the navigation based on the `Destination routes`


Inspiration:
https://medium.com/google-developer-experts/modular-navigation-with-jetpack-compose-fda9f6b2bef7
