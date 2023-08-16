FROM eclipse-temurin:17

RUN apt-get update && \
    apt-get install unzip wget -y
ENV TERRAFORM_VERSION=1.4.4
RUN wget https://releases.hashicorp.com/terraform/${TERRAFORM_VERSION}/terraform_${TERRAFORM_VERSION}_linux_amd64.zip
RUN unzip terraform_${TERRAFORM_VERSION}_linux_amd64.zip
RUN mv terraform /usr/bin/terraform
COPY target/terraform-boot-*.jar terraform-boot.jar
ENTRYPOINT ["java","-jar","terraform-boot.jar"]