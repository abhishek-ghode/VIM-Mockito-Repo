FROM qlik/gradle

MAINTAINER ABHISHEK GHODE

COPY . /var/project

WORKDIR /var/project

COPY ./build/libs libs 



ENTRYPOINT ["gradle","clean","war"]
