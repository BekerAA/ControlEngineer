<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html>
<!doctype html>
<html lang="ru">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="Личная страница — технологии, идеи, автоспорт и бизнес.">
  <title>Личная страница</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
  <main class="page">
    <section class="intro" aria-labelledby="headline">
      <div class="copy">
        <p class="eyebrow">ЛИЧНАЯ СТРАНИЦА</p>
        <h1 id="headline">Привет.<br>Рад, что ты здесь.</h1>
        <p class="description">
          Интересуюсь тем, как технологии и смелые идеи меняют привычный мир.
          Люблю находить новые возможности, создавать проекты и смотреть на вещи
          под неожиданным углом.
        </p>
        <a class="contact" href="https://t.me/i_ap_134" target="_blank" rel="noopener noreferrer">
          Связаться в Telegram <span aria-hidden="true">↗</span>
        </a>
      </div>

      <div class="portrait-wrap">
        <!-- Замените portrait-placeholder.jpg на своё фото -->
        <img class="portrait"
             src="${pageContext.request.contextPath}/images/my-photo.jpg"
             alt="Моя фотография">
      </div>
    </section>

    <section class="interests" aria-label="Интересы">
      <span>Технологии</span>
      <span>Идеи</span>
      <span>Автоспорт</span>
      <span>Бизнес</span>
    </section>

    <footer>© <span id="year"></span> Личная страница</footer>
  </main>
  <script>
    document.getElementById("year").textContent = new Date().getFullYear();
  </script>
</body>
</html>
