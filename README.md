# ColorPickerDialog
#### This Color Picker is also available as a StandAlone class, for that refer [ColorPickerDialog](https://github.com/RealDev05/ColorPickerDialogStandAlone.git)
- This library/module is written in java
- The is an extension of Alert Dialog Builder
- Most components are declared public so that they can be accessed from anywhere, thereby increasing versatility.
- Even though, messing with some variables and values can result in unecpected results
- This class was made for android ***SDK 21*** and above
- Can provide the color in ***integer*** and ***hex string*** form (eg : 0,1 and #FFFFFFFF, #FF000000)
- Hex string returned is in ***#AARRGGBB*** form 
## Setup
- If you are using old Android Studio (or any other IDE), refer to [![](https://jitpack.io/v/RealDev05/ColorPickerDialog.svg)](https://jitpack.io/#RealDev05/ColorPickerDialog)
- If you are using new Android Studio (or any other IDE)
- - Add 
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
         ...
         maven { url 'https://jitpack.io' }
    }
}
``` 
- - to your ***settings.gradle***
- - Add 
```
dependencies { 
  ...
  implementation 'com.github.RealDev05:ColorPickerDialog:Tag'
}
``` 
- - to your ***build.gradle*** of your app (not project or root)
- Contact me if there is any doubts/problems
## Usage
```
ColorPickerDialogBuilder colorPicker = new ColorPickerDialogBuilder(this);
colorPicker.show(new ColorPickerDialogBuilder.ColorPickedListener() {
    @Override
    
    public void OnColorPicked(int color, String hex) {
            
            
    }
    
});
```
