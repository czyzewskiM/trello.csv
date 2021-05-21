package com.mczyzewski.model.card;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
    public String id;
    public String name;
    public String desc;
    public String idList;
    public String idBoard;
    public String url;
    public String shortUrl;
    public List<Label> labels;
    public Long idShort;
    public Date dateLastActivity;
    public boolean closed;

    @Override
    public String toString() {
        String value = id.trim() + ';' +
                name.trim().replaceAll(";", ".") + ';' +
                desc.trim().replaceAll(";", ".") + ';' +
                idList.trim() + ';' +
                idBoard.trim() + ';' +
                url.trim() + ';' +
                shortUrl.trim() + ';' +
                labels.stream().map(label -> label.name).collect(Collectors.toList()) + ';' +
                idShort + ';' +
                dateLastActivity.toString().trim() + ';' +
                closed;
        value = value.replaceAll("\n", "");
        return value;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Label {
    public String idBoard;
    public String name;
    public String id;
}
