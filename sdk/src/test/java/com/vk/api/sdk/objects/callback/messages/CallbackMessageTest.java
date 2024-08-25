package com.vk.api.sdk.objects.callback.messages;

import com.google.gson.Gson;
import com.vk.api.sdk.objects.callback.MessageObject;
import org.junit.jupiter.api.Test;

import static com.vk.api.sdk.objects.photos.PhotoSizesType.BASE;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <A href="mailto:alexey@abashev.ru">Alexey Abashev</A>
 */
class CallbackMessageTest {

    @Test
    public void checkPhotoAttachment() {
        var gson = new Gson();

        var message = gson.fromJson(PHOTO_ATTACHMENT, CallbackMessage.class);
        var object = gson.fromJson(message.getObject(), MessageObject.class);

        assertEquals(191111, object.getMessage().getFromId());
        assertEquals(1, object.getMessage().getAttachments().size());

        var photo = object.getMessage().getAttachments().get(0).getPhoto();

        assertEquals(-3, photo.getAlbumId());
        assertEquals(10, photo.getSizes().size());
        assertEquals(
                "https://sun9-58.userapi.com/2,1151x2560&from=bu",
                photo.getOriginalPhoto().getUrl().toString()
        );
        assertEquals(1151, photo.getOriginalPhoto().getWidth());
        assertEquals(BASE, photo.getOriginalPhoto().getType());
    }

    @Test
    public void checkDocAttachment() {
        var gson = new Gson();

        var message = gson.fromJson(DOC_ATTACHMENT, CallbackMessage.class);
        var object = gson.fromJson(message.getObject(), MessageObject.class);

        assertEquals(12345, object.getMessage().getFromId());
        assertEquals(1, object.getMessage().getAttachments().size());

        var doc = object.getMessage().getAttachments().get(0).getDoc();

        assertEquals(68029, doc.getId());
        assertEquals(1724444913, doc.getDate());
        assertEquals("https://vk.com/doc519599181_680i=1&no_preview=1", doc.getUrl().toString());
        assertEquals("Dokument-2024-07-22_11_13_44.pdf", doc.getTitle());
        assertEquals("pdf", doc.getExt());
        assertEquals(50901, doc.getSize());
    }

    private static final String PHOTO_ATTACHMENT = "{\n" +
            "    \"group_id\": 1234,\n" +
            "    \"type\": \"message_new\",\n" +
            "    \"event_id\": \"a747812345239\",\n" +
            "    \"v\": \"5.199\",\n" +
            "    \"object\": {\n" +
            "        \"message\": {\n" +
            "            \"date\": 1724518113,\n" +
            "            \"from_id\": 191111,\n" +
            "            \"id\": 52680,\n" +
            "            \"out\": 0,\n" +
            "            \"version\": 10126916,\n" +
            "            \"attachments\": [\n" +
            "                {\n" +
            "                    \"type\": \"photo\",\n" +
            "                    \"photo\": {\n" +
            "                        \"album_id\": -3,\n" +
            "                        \"date\": 1724518113,\n" +
            "                        \"id\": 457555542,\n" +
            "                        \"owner_id\": 555555,\n" +
            "                        \"access_key\": \"402f72sgsdfsdf03\",\n" +
            "                        \"sizes\": [\n" +
            "                            {\n" +
            "                                \"height\": 75,\n" +
            "                                \"type\": \"s\",\n" +
            "                                \"width\": 34,\n" +
            "                                \"url\": \"https://sun9-58.ux801,480x1068,540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=34x75\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 130,\n" +
            "                                \"type\": \"m\",\n" +
            "                                \"width\": 58,\n" +
            "                                \"url\": \"https://sun9-58.user51x2560&from=bu&cs=58x130\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 604,\n" +
            "                                \"type\": \"x\",\n" +
            "                                \"width\": 272,\n" +
            "                                \"url\": \"https://sun9-58.use1151x2560&from=bu&cs=272x604\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 807,\n" +
            "                                \"type\": \"y\",\n" +
            "                                \"width\": 363,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/v1/540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=363x807\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 1080,\n" +
            "                                \"type\": \"z\",\n" +
            "                                \"width\": 486,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/vx1068,540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=486x1080\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 2160,\n" +
            "                                \"type\": \"w\",\n" +
            "                                \"width\": 971,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/v1/540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=971x2160\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 289,\n" +
            "                                \"type\": \"o\",\n" +
            "                                \"width\": 130,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/v1/EbScnuXmX3534,360x801,480x1068,540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=130x289\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 445,\n" +
            "                                \"type\": \"p\",\n" +
            "                                \"width\": 200,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/M60x356,240x534,360x801,480x1068,540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=200x445\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 712,\n" +
            "                                \"type\": \"q\",\n" +
            "                                \"width\": 320,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/v1/ig2/X0HfhesnYN4Mm4MTiwYO68,540x1201,640x1423,720x1601,1080x2402,1151x2560&from=bu&cs=320x712\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"height\": 900,\n" +
            "                                \"type\": \"r\",\n" +
            "                                \"width\": 510,\n" +
            "                                \"url\": \"https://sun9-58.userapi.com/s/x1601,1080x2402,1151x2560&from=bu&cs=510x900\"\n" +
            "                            }\n" +
            "                        ],\n" +
            "                        \"text\": \"\",\n" +
            "                        \"web_view_token\": \"jjjjjjjj\",\n" +
            "                        \"has_tags\": false,\n" +
            "                        \"orig_photo\": {\n" +
            "                            \"height\": 2560,\n" +
            "                            \"type\": \"base\",\n" +
            "                            \"url\": \"https://sun9-58.userapi.com/2,1151x2560&from=bu\",\n" +
            "                            \"width\": 1151\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"conversation_message_id\": 13,\n" +
            "            \"fwd_messages\": [],\n" +
            "            \"important\": false,\n" +
            "            \"is_hidden\": false,\n" +
            "            \"peer_id\": 199219,\n" +
            "            \"random_id\": 0,\n" +
            "            \"text\": \"\"\n" +
            "        },\n" +
            "        \"client_info\": {\n" +
            "            \"button_actions\": [\n" +
            "                \"text\",\n" +
            "                \"vkpay\",\n" +
            "                \"open_app\",\n" +
            "                \"location\",\n" +
            "                \"open_link\",\n" +
            "                \"open_photo\",\n" +
            "                \"callback\",\n" +
            "                \"intent_subscribe\",\n" +
            "                \"intent_unsubscribe\"\n" +
            "            ],\n" +
            "            \"keyboard\": true,\n" +
            "            \"inline_keyboard\": true,\n" +
            "            \"carousel\": true,\n" +
            "            \"lang_id\": 0\n" +
            "        }\n" +
            "    },\n" +
            "    \"secret\": \"12345\"\n" +
            "}";

    private static final String DOC_ATTACHMENT = "{\n" +
            "    \"group_id\": 19755576,\n" +
            "    \"type\": \"message_new\",\n" +
            "    \"event_id\": \"e07dc66298dc584fffffffffc9d5d\",\n" +
            "    \"v\": \"5.199\",\n" +
            "    \"object\": {\n" +
            "        \"message\": {\n" +
            "            \"date\": 172555515,\n" +
            "            \"from_id\": 12345,\n" +
            "            \"id\": 52628,\n" +
            "            \"out\": 0,\n" +
            "            \"version\": 10126800,\n" +
            "            \"attachments\": [\n" +
            "                {\n" +
            "                    \"type\": \"doc\",\n" +
            "                    \"doc\": {\n" +
            "                        \"id\": 68029,\n" +
            "                        \"owner_id\": 12345,\n" +
            "                        \"title\": \"Dokument-2024-07-22_11_13_44.pdf\",\n" +
            "                        \"size\": 50901,\n" +
            "                        \"ext\": \"pdf\",\n" +
            "                        \"date\": 1724444913,\n" +
            "                        \"type\": 1,\n" +
            "                        \"url\": \"https://vk.com/doc519599181_680i=1&no_preview=1\",\n" +
            "                        \"is_unsafe\": 0,\n" +
            "                        \"access_key\": \"vzxzrVefgDEgh0\",\n" +
            "                        \"can_manage\": true\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"conversation_message_id\": 586,\n" +
            "            \"fwd_messages\": [],\n" +
            "            \"important\": false,\n" +
            "            \"is_hidden\": false,\n" +
            "            \"peer_id\": 515555,\n" +
            "            \"random_id\": 0,\n" +
            "            \"text\": \"\"\n" +
            "        },\n" +
            "        \"client_info\": {\n" +
            "            \"button_actions\": [\n" +
            "                \"text\",\n" +
            "                \"vkpay\",\n" +
            "                \"open_app\",\n" +
            "                \"location\",\n" +
            "                \"open_link\",\n" +
            "                \"callback\",\n" +
            "                \"intent_subscribe\",\n" +
            "                \"intent_unsubscribe\"\n" +
            "            ],\n" +
            "            \"keyboard\": true,\n" +
            "            \"inline_keyboard\": true,\n" +
            "            \"carousel\": true,\n" +
            "            \"lang_id\": 0\n" +
            "        }\n" +
            "    },\n" +
            "    \"secret\": \"secret\"\n" +
            "}";

}
