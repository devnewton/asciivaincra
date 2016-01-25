$("#convert").click(function() {
	$.ajax({
		url : "/ajax/convert",
		method: "POST",
		data: { text : $("#input").val() }
	}).done(function(data) {
		$("#output").val(data.convertedText);
	})
})