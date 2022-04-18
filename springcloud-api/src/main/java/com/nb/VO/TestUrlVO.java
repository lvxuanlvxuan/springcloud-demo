package com.nb.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2021/7/19 16:22
 * @Version: 1.0
 * @motto: 而后乃将图南
 * @Description: des
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * You are not expected to understand this
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestUrlVO {

    @JsonProperty("source")
    private SourceDTO source;
    @JsonProperty("payload")
    private PayloadDTO payload;

    @NoArgsConstructor
    @Data
    public static class SourceDTO {
        @JsonProperty("eventType")
        private String eventType;
        @JsonProperty("eventTime")
        private String eventTime;
        @JsonProperty("eventId")
        private String eventId;
    }

    @NoArgsConstructor
    @Data
    public static class PayloadDTO {
        @JsonProperty("partnerId")
        private String partnerId;
        @JsonProperty("itemInfo")
        private ItemInfoDTO itemInfo;
        @JsonProperty("offer")
        private OfferDTO offer;

        @NoArgsConstructor
        @Data
        public static class ItemInfoDTO {
            @JsonProperty("itemId")
            private String itemId;
            @JsonProperty("itemName")
            private String itemName;
            @JsonProperty("category")
            private String category;
            @JsonProperty("productType")
            private String productType;
            @JsonProperty("brand")
            private String brand;
            @JsonProperty("sku")
            private String sku;
            @JsonProperty("totalNumberOfOffers")
            private Integer totalNumberOfOffers;
        }

        @NoArgsConstructor
        @Data
        public static class OfferDTO {
            @JsonProperty("currentOffer")
            private CurrentOfferDTO currentOffer;
            @JsonProperty("winningOffer")
            private WinningOfferDTO winningOffer;
            @JsonProperty("priceDifference")
            private BigDecimal priceDifference;

            @NoArgsConstructor
            @Data
            public static class CurrentOfferDTO {
                @JsonProperty("sellerName")
                private String sellerName;
                @JsonProperty("sellerOfferPrice")
                private BigDecimal sellerOfferPrice;
                @JsonProperty("sellerShippingSpeed")
                private String sellerShippingSpeed;
                @JsonProperty("sellerShippingPrice")
                private BigDecimal sellerShippingPrice;
            }

            @NoArgsConstructor
            @Data
            public static class WinningOfferDTO {
                @JsonProperty("sellerName")
                private String sellerName;
                @JsonProperty("sellerOfferPrice")
                private BigDecimal sellerOfferPrice;
                @JsonProperty("sellerShippingSpeed")
                private String sellerShippingSpeed;
                @JsonProperty("sellerShippingPrice")
                private Integer sellerShippingPrice;
            }
        }
    }
}
