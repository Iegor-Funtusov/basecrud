function encript() {
    let encoder = document.getElementById('encoder').value;
    console.log(encoder)
    encdec("/encript/encode", encoder, "encriptResult")
}

function decript() {
    let decoder = document.getElementById('decoder').value;
    console.log(decoder)
    encdec("/encript/decode", decoder, "decriptResult")
}

function addList() {
    let decoder = document.getElementById('list').value;
    console.log(decoder)
    encdec("/encript/arraylist", decoder, "listResult")
}

function addSet() {
    let decoder = document.getElementById('set').value;
    console.log(decoder)
    encdec("/encript/treeset", decoder, "setResult")
}

function encdec(url, data, box) {
    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: url,
        data: data,
        success: function (result) {
            document.getElementById(box).innerHTML = result;
        },
        error: function () {
            return "error";
        }
    });
}


function addInteger(url, data, box) {
    jQuery.ajax({
        type: "POST",
        contentType: "application/json",
        url: url,
        data: data,
        success: function (result) {
            document.getElementById(box).innerHTML = result;
        },
        error: function () {
            return "error";
        }
    });
}
