package com.github.cloudyrock.mongock.changelogs.client;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.client.Client;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.decorator.impl.MongockTemplate;

import static com.github.cloudyrock.mongock.Spring5SpringData2App.CLIENTS_COLLECTION_NAME;

@ChangeLog(order = "5")
public class Log4 {
    @ChangeSet(id = "data-updater-runAlways-123", order = "001", author = "mongock")
    public void dataUpdater(MongockTemplate template) {

        template.findAll(Client.class, CLIENTS_COLLECTION_NAME)
                .stream()
                .map(client -> client.setChina(123))
                .forEach(client -> template.save(client, CLIENTS_COLLECTION_NAME));

    }
}
