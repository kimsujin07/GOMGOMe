
$(document).ready(function(){
	$('.modalOpen').on('click', modalOpen);
	$('.modalClose').on('click', modalClose);
	$('.modal-container').on('click', function(e){
		if(!$('.modal-wrapper').has(e.target).length){
			$('html').removeClass('modalOn');
			$(this).fadeOut(0);
			$(this).delay(50).fadeOut(0);
			$(this).removeClass('show');
			$('html').css('overflow-y','auto');
		}
	});
});
function modalOpen(modalID){
	$('html').css('overflow-y','hidden');
	$('.modal-container').fadeOut(0);
	$('.modal-container').removeClass('show');
	$(this).data('modal') ? modalID = $(this).data('modal') : '';
	$('.modal-container.show').length > 0 ? $('#' + modalID).css({
		'z-index': $('.modal-container.show').css('z-index') + 1,
		'background': 'transparent'
	}) : '';
	$('#' + modalID).css('display', 'flex').focus();
	$('#' + modalID + ' .modal-wrapper').delay(100).fadeIn(100).focus();
	$('#' + modalID).addClass('show').focus();

	return false;
}
function modalClose(){
	$('html').css('overflow-y','auto');
	$(this).closest('.modal-container').fadeOut(0);
	$(this).closest('.modal-container').removeClass('show');
}