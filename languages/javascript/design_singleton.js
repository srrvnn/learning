var Singleton = (function () {

	var instance;

	return {

		getInstance: function () {

			if (!instance) {
				instance = new Object();
			}

			return instance;
		}
	};

})();