FROM openjdk:8

WORKDIR /workspace
ADD https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb google-chrome-stable_current_amd64.deb 
ADD https://chromedriver.storage.googleapis.com/2.42/chromedriver_linux64.zip chromedriver_linux64.zip
RUN unzip chromedriver_linux64.zip && rm chromedriver_linux64.zip
RUN apt update; apt install ./google-chrome-stable_current_amd64.deb -y; \
    apt clean autoclean; apt autoremove -y; rm -rf /var/lib/{apt,dpkg,cache,log}/

COPY . ./
CMD ["./gradlew", "run"]