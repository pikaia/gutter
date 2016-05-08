# GenerateEchoUtterances
Demo of using generex to generate Echo SampleUtterances file from template

For example
```
  ResetIntent (wipe|erase|forget|clear|reset|restart)(( the)?( trip))?
```

Expands to:
```
    ResetIntent start over
    ResetIntent wipe
    ResetIntent wipe trip
    ResetIntent wipe the trip
    ResetIntent forget
    ResetIntent forget trip
    ResetIntent forget the trip
    ResetIntent clear
    ResetIntent clear trip
    ResetIntent clear the trip
    ResetIntent restart
    ResetIntent restart trip
    ResetIntent restart the trip
    ResetIntent reset
    ResetIntent reset trip
    ResetIntent reset the trip
    ResetIntent erase
    ResetIntent erase trip
    ResetIntent erase the trip
```
