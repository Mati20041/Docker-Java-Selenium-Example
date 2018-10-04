Selenium Hi!
============

Simple project in java to test SeleniumHQ behaviour in docker container.

#To run

```
docker iamge build . -t seleniumhi
docker container run --name seleniumhi seleniumhi
```

You might also want to see screenshot that application downloads.

```docker container cp seleniumhi:/workspace/screen.png screen.png```