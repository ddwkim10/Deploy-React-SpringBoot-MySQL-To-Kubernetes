FROM node:alpine3.16

WORKDIR /sb-client

COPY package*.json ./

RUN npm install

COPY . .

CMD [ "npm", "start" ]
