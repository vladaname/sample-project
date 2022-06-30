<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Statistika prodaje</title>
</head>
<body>
	<form action="/PicaWEB/BrojProdatihPicaPoDanu" method="post">
		<select name="myselect" id="myselect" onchange="this.form.submit()">
			<c:forEach begin="0" end="365" step="5" varStatus="loop">
				<option value="${loop.count}">${loop.count} dana u nazad</option>
			</c:forEach>
		</select>
	</form>
	<canvas id="myChart" width="400" height="200"></canvas>
	<script>

                var ctx = document.getElementById("myChart").getContext('2d');
                var myChart = new Chart(ctx, {
                    type: 'line',
                    data: {
                        labels: [value="${data[0][1]}", value="${data[1][1]}", value="${data[2][1]}", value="${data[3][1]}", value="${data[4][1]}", value="${data[5][1]}", value="${data[6][1]}", value="${data[7][1]}", value="${data[8][1]}", value="${data[9][1]}"],
                        datasets: [{
                            label: 'Prodaja',
                            data: [value="${data[0][0]}", value="${data[1][0]}", value="${data[2][0]}", value="${data[3][0]}", value="${data[4][0]}", value="${data[5][0]}", value="${data[6][0]}", value="${data[7][0]}", value="${data[8][0]}", value="${data[9][0]}"],
                            backgroundColor: [
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(153, 102, 255, 0.2)'
                            ],
                            borderColor: [
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(153, 102, 255, 1)'
                            ],
                            borderWidth: 1
                        }
                        ]

                    },
                    options: {
                        scales: {
                            yAxes: [{
                                ticks: {
                                    beginAtZero:true
                                }
                            }]
                        },
                        title: {
                            display: true,
                            text: 'Top 10 pica po prodaji'
                        }
                    }
                });
            </script>

</body>
</html>