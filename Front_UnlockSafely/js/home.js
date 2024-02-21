function openTab(tabId) {
  var tabs = document.querySelectorAll('.tab-content');
  var tabButtons = document.querySelectorAll('.tab');

  tabs.forEach(function(tab) {
    tab.classList.remove('active');
  });

  tabButtons.forEach(function(tabButton) {
    tabButton.classList.remove('active');
  });

  var tabContent = document.getElementById(tabId);
  var tabButton = document.getElementById(tabId + "Btn");

  tabContent.classList.add('active');
  tabButton.classList.add('active');
}
