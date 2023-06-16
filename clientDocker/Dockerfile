FROM node:alpine3.16

WORKDIR /sb-client

COPY . .

RUN npm ci --legacy-peer-deps
RUN npm run build

EXPOSE 8080

CMD [ "npm", "start" ]
