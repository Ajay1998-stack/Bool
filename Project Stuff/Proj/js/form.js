// Define your product name and version
tomtom.setProductInfo('<your-product-name>', '<your-product-version>');
// Creating map
var map = tomtom.L.map('map', {
    key: '<your-tomtom-API-key>',
    source: 'vector',
    basePath: '<your-tomtom-sdk-base-path>'
});
// Creating Find Location widget
var FindLocationControl = tomtom.L.Control.extend({
    onAdd: function(map) {
        var container = L.DomUtil.create('div', 'leaflet-control'),
            btn = L.DomUtil.create('div', 'icon-locate_me_btn', container);
        btn.role = 'button';
        btn.title = 'Click me to locate you';
        btn.onclick = function() {
            map.locate({setView: true, maxZoom: 15});
        };
        map.on('locationfound', this.displayMarker, this);
        map.on('locationerror', this.showLocationErrorMessage, this);
        return container;
    },
    onRemove: function(map) {
        map.off('locationfound', this.displayMarker, this);
        map.off('locationerror', this.showLocationErrorMessage, this);
    },
    displayMarker: function(evt) {
        if (this._marker) {
            this._marker.setLatLng(evt.latlng);
            return;
        }
        this._marker = L.marker(evt.latlng, {
            title: 'Your current location',
            icon: L.svgIcon({
                background: {
                    icon: 'icon-locate_me_btn',
                    iconSize: [30, 30],
                    iconAnchor: [15, 15]
                },
                icon: null,
                opacity: 1
            })
        }).addTo(this._map);
    },
    showLocationErrorMessage: function() {
        tomtom.messageBox({closeAfter: 3000})
            .setContent('Could not find your location')
            .openOn(this._map);
    }
});
map.addControl(new FindLocationControl());