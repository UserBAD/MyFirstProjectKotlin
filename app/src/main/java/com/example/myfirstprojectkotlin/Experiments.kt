package com.example.myfirstprojectkotlin

class Experiments {
    fun doExperiments() {
        val passport = PassportData("Ivan", 30)
        val copyPassport = passport.copy(age = 21)

        val client = ClientObject.name


        val weatherList: List<String> = arrayListOf()
        for (weather in weatherList) {
            print(weather)
        }
        weatherList.forEach { weather ->
            print(weather)
        }
        for (i in weatherList.indices) {
            print(weatherList[i])
        }
        for (i in 1..10) {
            print("Hello Kotlin!")
        }
        for (i in 10 downTo 1 step 2) {
            print("Hello Kotlin!")
        }

        for (i in 0 until weatherList.size) {
            print(weatherList[i])
        }

    }
}