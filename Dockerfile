FROM openjdk:8-alpine

# 預設ＵＴＣ
ENV TZ=Asia/Taipei
RUN set -eux; \
    apk add --no-cache --update tzdata; \
    ln -snf /usr/share/zoneinfo/$TZ /etc/localtime; \
    echo $TZ > /etc/timezone

# 新建用户java-app
RUN set -eux; \
    addgroup --gid 1000 java-app; \
    adduser -S -u 1000 -g java-app -h /home/java-app/ -s /bin/sh -D java-app; \
    mkdir -p /home/java-app/lib /home/java-app/etc /home/java-app/jmx-ssl /home/java-app/logs /home/java-app/tmp /home/java-app/jmx-exporter/lib /home/java-app/jmx-exporter/etc; \
    chown -R java-app:java-app /home/java-app

# 啟動
COPY --chown=java-app:java-app docker-entrypoint.sh /home/java-app/docker-entrypoint.sh

# JAR
COPY --chown=java-app:java-app target/${JAR_FILE} /home/java-app/lib/app.jar

USER java-app

ENTRYPOINT ["/home/java-app/docker-entrypoint.sh"]

EXPOSE 9478
