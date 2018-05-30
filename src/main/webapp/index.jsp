<html>
<head>
	<!-- 生产环境版本，优化了尺寸和速度 -->
	<script src="https://cdn.jsdelivr.net/npm/vue">
		var app = new Vue({
		  el: '#app',
		  data: {
		    message: 'Hello Vue!'
		  }
		});
	</script>
</head>
<body>
	<h2>Hello World!</h2>
	
	<div id="app">
  		{{ message }}
	</div>
	
</body>
</html>
