//= Athena Script ==============================================================
// Ragnarok Online Rachel Town Script	by Blaze
//= Registry ===================================================================
// $RachelDonate -> �����l��
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
ra_in01.gat,176,389,3	shop	���폤�l	931,1201,1207,1216,1107,1122,1116,1154,1407,1457,1354,1519,13003,1601,1604,1607
ra_in01.gat,175,364,3	shop	�h��l	919,2101,2103,2403,2405,2503,2321,2314,2309,2335,2628
ra_in01.gat,257,269,3	shop	����l	919,501,502,503,504,506,645,656,601,602,611,1065,610
ra_in01.gat,254,300,3	shop	�ʕ����l	931,512,513
rachel.gat,65,80,1	shop	��؏��l	919,515,535,516

//============================================================
// ��s�DNPC
//------------------------------------------------------------
ra_fild12.gat,285,207,3	script	���K���_��	914,{
	if($RachelDonate < 10000) {
		mes "[�p�p�C]";
		mes "�A���i�x���c�ɂ悤�����I";
		mes "�悢�����`";
		next;
		if(select("�K�C�h����ł����H","���肪�Ƃ��������܂�")==2) {
			mes "[�p�p�C]";
			mes "���_�t���C���l�̌����A�j����";
			mes "���ɂ���񎖂��I";
			mes "�_�a�ւ���������̂Ȃ�";
			mes "����A���������肢�������܂��I";
			mes "�_�a�̓����Ŏ󂯕t���Ă���܂�����I";
			close;
		}
		mes "[�p�p�C]";
		mes "����!!";
		mes "���́A�_�a����L�񊈓��ɔh�����ꂽ";
		mes "�p�p�C�Ɛ\���܂��B";
		mes "�����ɖ��D������܂����ǁc�c";
		next;
		mes "[�p�p�C]";
		mes "�K�C�h����Ȃ�A�������琼���ʂɂ���";
		mes "���w���̍L��̖k���ɂ��܂���I";
		next;
		mes "[�p�p�C]";
		mes "���������A�_�a����Â���t���C���l��";
		mes "�j�����Ղ肪�J����܂��B";
		mes "���x�A���ׂ̈̌������s���Ă܂��āB";
		mes "�n�C�A�������ڂ���Ă��ł́c�c";
		next;
		mes "[�p�p�C]";
		mes "������������ł����H";
		mes "�_�a�̑O�ŁA���̗l�ɖ��D�����Ă���";
		mes "�l�}�_���Ƃ��������A";
		mes "�������󂯕t���Ă���܂��B";
		next;
		mes "[�p�p�C]";
		mes "�������Ē����ƁA";
		mes "����Ȃ����I�������z�肵�Ă���܂��B";
		mes "���I���́A�_�a�̑q�ɂɂ�����̂�";
		mes "�������ł��܂��āc�c";
		next;
		mes "[�p�p�C]";
		mes "�ǂ�ȕ����Ⴆ�邩�́A";
		mes "���������悭�킩��܂���B";
		mes "�q�ɂ���o��^0000FF�f�G�Ȃ���^000000��";
		mes "�����グ��ƕ����������ł��̂Łc�c";
		next;
		mes "[�p�p�C]";
		mes "����A���������肢�������܂��I";
		mes "���_�t���C���l�̌���삪";
		mes "���ɂ���񎖂��I";
		close;
	}
	mes "[�p�p�C]";
	mes "�A���i�x���c�ɂ悤�����I";
	mes "���̏�ǂ̌������ɂ���s�s��";
	mes "�����A�A���i�x���c�̎�s�ł���";
	mes "�u���w���v�ł��B";
	next;
	mes "[�p�p�C]";
	mes "�����ŁA�����ł��傤�B";
	mes "���w���ň�x�݂��Ă͂������ł����H";
	next;
	if(select("�K�C�h����ł����H","��s�ɂ��Đ������Ă�������")==2) {
		mes "[�p�p�C]";
		mes "���́A�_�a����L�񊈓��ׂ̈�";
		mes "�h�����ꂽ�p�p�C�Ɛ\���܂��B";
		next;
		mes "[�p�p�C]";
		mes "��X�́A���_�t���C���l��";
		mes "�M���Ă���܂����A�O���̕��ɂ�";
		mes "���܂�m���Ă���܂���B";
		next;
		mes "[�p�p�C]";
		mes "��������������A�_�a��q�˂Ă݂�";
		mes "���������`�I";
		next;
		mes "[�p�p�C]";
		mes "����ł́A�悢�����`";
		close;
	}
	mes "[�p�p�C]";
	mes "��X�̐�c�����́A";
	mes "���̍L���������J�񂵁A";
	mes "�l�X���Z�߂�悤�ɂ��܂����B";
	mes "�_�̌䓱���ł����ɗ��Ă���A������";
	mes "�_�̌�ӎu�ɏ]���A��炵�Ă��܂����B";
	next;
	mes "[�p�p�C]";
	mes "���A�������猩������i��";
	mes "�S���l�Ԃ����o�������̂ł��B";
	mes "�ܘ_�A�_�̗͖����ł�";
	mes "�����������Ȃ������ł��傤���ǁB";
	next;
	mes "[�p�p�C]";
	mes "�M���鎖�A���݂������x���鎖��";
	mes "���ꂾ�������͂������Ă���Ƃ�";
	mes "��c���m��Ȃ������͂��ł��B";
	next;
	mes "[�p�p�C]";
	mes "��X�́A���_�t���C���l�ׂ̈Ȃ�";
	mes "�����̂Ă�o�傪�o���Ă���܂��B";
	next;
	mes "[�p�p�C]";
	mes "���Ȃ����A��s�֍s���Ă݂�΁A";
	mes "�������Ē�����Ǝv���܂���B";
	close;
}

ra_fild12.gat,45,230,3	script	��s�D�K�C�h	934,{
	mes "[��s�D�K�C�h]";
	mes "�V���o���c�o���h���a�����^�c����";
	mes "���O�D�̔�s�D�́A";
	mes "�A���i�x���c�����̃��w��������";
	mes "�J�`����Ă���܂��B";
	next;
	mes "[��s�D�K�C�h]";
	mes "��s�D�ɏ�肽���ꍇ�́A";
	mes "�~�j�}�b�v��ɕ\�������n���";
	mes "�ړ����Ă��������B";
	viewpoint 1,293,208,1,0x00FF00;
	close;
}

airplane.gat,238,54,7	script	���l	59,{
	if($RachelDonate >= 10000) {
		mes "[���l]";
		mes "��������A���w���̐_�a�Ō��������Ă�";
		mes "�Y��Ȑ_������c�c";
		mes "���������Ă��݂��������ǁc�c";
		mes "�����A���v�Ȃ̂��ˁH";
		close;
	}
	mes "[���l]";
	mes "���ƗF�B���A���w���ƌ����s�s��";
	mes "�s�������ɐ_�a�Ō�����������B";
	mes "�����f�G�ȕ����������Č������";
	mes "�������Ă݂��̂�B";
	next;
	mes "[���l]";
	mes "�F�B�͖{���������āB";
	mes "�{�ɂ́A�s�v�c�ȉ������`���ꂽ";
	mes "�Y��ȃJ�[�h�����܂�Ă��������c�c";
	next;
	mes "[���l]";
	mes "�������̑q�ɂ���o���������";
	mes "��������ǁc�c�ς��������������B";
	mes "�_���������킩��Ȃ������Č�������";
	mes "�Ƃɂ����A�H�ׂĂ݂��炳�I";
	mes "���������C���o���񂾂�I";
	next;
	mes "[���l]";
	mes "���Ղ�ׂ̈Ɍ�����������āB";
	mes "���܂ł��̂��킩��񂯂ǁA";
	mes "�ɂԂ��ł��ɂ͂��傤�ǂ�������";
	mes "�����܂�����Ă݂悤���ȁ`��";
	close;
}

//============================================================
// ���w��NPC
//------------------------------------------------------------
rachel.gat,127,117,4	script	�����M�k	914,{
	mes "[�e�B�m]";
	mes "�_��M���邾���ł͂����܂���B";
	mes "�]��ł΂���ł������܂���B";
	mes "���ꂾ���ł́A�K���͖K��Ȃ��B";
	next;
	mes "[�e�B�m]";
	mes "���ׂ������ʂ����A�_�̌�ӎv�����B";
	mes "���ꂪ�������ł��B";
	next;
	emotion 1,"";
	mes "[�e�B�m]";
	mes "���́A���̌��������킩��Ȃ��Ă�";
	mes "�����킩��������܂��B";
	close;
}

rachel.gat,124,132,1	script	���̏Z��	921,{
	mes "[���̏Z��]";
	mes "���_�t���C���l�̌���삪";
	mes "���ɂ���񎖂��c�c";
	next;
	mes "[���̏Z��]";
	mes "���_�t���C���l�͈��Ɣ��̏��_�ł��B";
	mes "�t���C���l�ɂ��F�肷��΁A";
	mes "�t���C���l�̂悤�ɔ�����������";
	mes "�^���I�ȏo�������̂ł��傤���H";
	close;
}

rachel.gat,197,137,3	script	��V���l	51,{
	mes "[��V���l]";
	mes "�����`���I";
	mes "���͕��Q����`";
	mes "��V���l�`�`�`�`�`��";
	next;
	mes "[��V���l]";
	mes "�����͔���������ǂ���";
	mes "���w����H���Ă��܂����ˁ`�`�`��";
	next;
	mes "[��V���l]";
	mes "�����`��!!";
	mes "���͕����Ă��܂����ˁ`�`�`�`�`��";
	next;
	mes "[��V���l]";
	mes "���̗l�ɂ��Ȃ₩�Ł`��";
	mes "�S���̗l�ɐ^�����ȏ����̋��c���`�`��";
	mes "�_�a�ɂ��鎖���`�`�`�`��";
	next;
	mes "[��V���l]";
	mes "�ǂ�����΋��c�ɉ�邾�낤�`�`��";
	mes "���������Ɖ̂Ŕޏ���U���ׂ����`�`��";
	mes "�ʂ�߂��邻���̂��Ȃ�!!";
	mes "���ɋ����Ă�����`�`�`�`�`��";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�Œ�Ȏ��ł��ˁI";
	next;
	emotion 28;
	mes "[��V���l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c�c�c�B";
	close;
}

rachel.gat,201,174,3	script	�t���C���M�k	926,{
	mes "[�t���C���M�k]";
	mes "�A���i�x���c�͏��_�t���C���l��";
	mes "�M���鍑�ł��B";
	mes "�A���i�x���c�����Ƃ������܂��B";
	next;
	mes "[�t���C���M�k]";
	mes "���������𒅂��l�X�����܂���ˁB";
	mes "���̂悤�ɖX�q�₨�ʂ����Ă���";
	mes "�l�X�́w��ʐM�k�x�ƌ����܂��B";
	next;
	mes "[�t���C���M�k]";
	mes "�������A�F���t���C���l��";
	mes "�M���Ă��܂����c�c";
	mes "���ʂ̐M�k�Ƃ������ł��傤���B";
	next;
	mes "[�t���C���M�k]";
	mes "�^�������Y��ȕ����̐l�X��";
	mes "�w�_���x�l�ł��B";
	mes "�_�a�̎d����e��@���֘A�Ɩ���";
	mes "�Ȃ�����X�ł��ˁB";
	next;
	mes "[�t���C���M�k]";
	mes "�����āA���c�l�̑��߂ɂ��āA";
	mes "���̃A���i�x���c�ׂ̈ɁA���";
	mes "�����Ă�������X���w��_���x�l�B";
	mes "�w�_���x�l�����������ڗ��̂ŁA";
	mes "�����킩��܂���B";
	next;
	mes "[�t���C���M�k]";
	mes "����֌W�҂̕��X�́A��Z��������";
	mes "����f�����������Ȃ��悤��";
	mes "�C�����Ă��������ˁB";
	close;
}

rachel.gat,209,198,3	script	�L�m�X	921,{
	mes "[�L�m�X]";
	mes "���̔����J���ĉƂɓ����Ă��A";
	mes "�ǂ�ł���������������I���";
	mes "����������̉Ƃɂ���̂�I";
	next;
	mes "[�L�m�X]";
	mes "�ŏ��̓e�[�u����֎q�𓮂����B";
	mes "���ꂩ��A�G���������肷��̂��B";
	next;
	mes "[�L�m�X]";
	mes "�_���H";
	mes "���[��c�c";
	mes "����σ_�����Ȃ��c�c";
	close;
}

rachel.gat,260,175,3	script	�A���N	914,{
	mes "[�A���N]";
	mes "�������`";
	mes "�q���q���ƋS�����������Ă�������";
	mes "������Ȃ��񂾂�ˁB";
	mes "����1���Ԃ��T���Ă�̂Ɂc�c";
	next;
	mes "[�A���N]";
	mes "�������󂢂Ă�������A";
	mes "�A�肽���񂾂��ǁc�c";
	mes "�q���q���A�����o�Ă���!!";
	close;
}

rachel.gat,272,141,3	script	�Q�Ă���q	921,{
	mes "[�Q�Ă���q]";
	mes "���`�c�c";
	mes "�c�c�A���N�̃o�J�I";
	mes "�c�c�c�c���j�����j���c�c�c�c";
	close;
}

rachel.gat,74,150,6	script	���̏���	914,{
	mes "[���̏���]";
	mes "���c�l�́A���������Ĕ���������B";
	mes "������񂪌��������ǁA";
	mes "�������������l�́A������l";
	mes "�������A���̎q�����Ȃ񂾂��āI";
	next;
	mes "[���̏���]";
	mes "���_�t���C���l�̉��g�炵����I";
	mes "���g���ĉ����낤�c�c";
	mes "�����A�Y��ȋ{�a��";
	mes "���P�l���Ď�����ˁI";
	close;
}

rachel.gat,76,77,3	script	���w���_��	927,{
	mes "[���w���_��]";
	mes "���Ђ�`�I";
	mes "����ς�A�Ζ����̂�����";
	mes "�ō��ɂ��������ȁ`�I";
	close;
}

rachel.gat,206,30,3	script	�t���C���_��	920,{
	mes "[�t���C���_��]";
	mes "�܂�Ȃ��c�c";
	next;
	mes "[�t���C���_��]";
	mes "�܂�Ȃ��c�c!!!!";
	next;
	emotion 7;
	mes "[�t���C���_��]";
	mes "���[!!�@�܂�ȁ[���I";
	next;
	if(select("�c�c�͂��c�c","�ʔ������ł����܂��傤���H")==1) {
		mes "[�t���C���_��]";
		mes "�ӂ�I";
		mes "�܂�Ȃ���I";
		close;
	}
	mes "[�t���C���_��]";
	mes "����I�@����!!";
	mes "��������́H";
	next;
	if(select("�ʔ����b�����Ă����܂���","���ɉ������Ă������ł���")==1) {
		mes "[�t���C���_��]";
		mes "�ʔ����b�H";
		mes "�ȂɂȂɁH";
		mes "�����������āI";
		next;
		mes "-���Ȃ��͍ō��ɃE�P���";
		mes "�@�v���b���I����-";
		misceffect 295,"";
		next;
		mes "[�t���C���_��]";
		mes "�n�@�c�c";
		mes "�����c�c�c�c�����������B";
		close;
	}
	mes "[�t���C���_��]";
	mes "�Ӂ[��c�c�{���H";
	mes "����A����͂ǂ����ȁH";
	mes "�G�C�b!!!!";
	close2;
	switch(rand(10)) {
	case 0:
	case 1:
		warp "Random",0,0;
		end;
	case 2:
	case 3:
		//sc_start SC_SPEEDUP,5000,0;
		end;
	default:
		//sc_start SC_SLOWDOWN,5000,0;
		end;
	}
}

rachel.gat,125,33,5	script	���w���x����#ra	934,{
	mes "[���w���x����]";
	mes "�����̓A���i�x���c�����̐_���ȓs�s�A";
	mes "���w���ł��B";
	mes "�ē��A�y�ъe��T�[�r�X�̓��w��������";
	mes "�K�C�h�ɂĂ��₢���킹�Ă��������B";
	close;
}
rachel.gat,31,130,3	duplicate(���w���x����#ra)	���w���x����	934
rachel.gat,268,120,1	duplicate(���w���x����#ra)	���w���x����	934

rachel.gat,144,243,5	script	�Z�X�����j���x����#ra	934,{
	mes "[�Z�X�����j���x����]";
	mes "�����͏��_�t���C���l�̉��g�ł���";
	mes "���c�l�����킷�A�Z�X�����j���ł��B";
	mes "�S�Ƒ̂����ɐ��߂Ă���";
	mes "�����肭�������B";
	close;
}
rachel.gat,155,243,3	duplicate(�Z�X�����j���x����#ra)	�Z�X�����j���x����	934

//============================================================
// �t���C����_�aNPC
//------------------------------------------------------------
ra_temple.gat,148,91,3	script	�M�k�A�J���i	917,{
	mes "[�M�k�A�J���i]";
	mes "�Z�X�����j���c�c";
	mes "�����A���̔������{�a��";
	mes "�̑�ȏ��_�t���C���l��";
	mes "�����������������ł��傤�B";
	mes "�{���Ɋy���݂ł��ˁI";
	mes "�ӂӂӁB";
	close;
}

ra_temple.gat,115,148,7	script	�M�k���N��	917,{
	mes "[�M�k���N��]";
	mes "�i�ԂԂj";
	mes "�i�ԂԂj";
	mes "�i�ԂԂj";
	next;
	mes "-�ڂ̑O�̐M�k��";
	mes "�@�����̂悤�Ȗ{��ǂގ��ɖ����ŁA";
	mes "�@���������Ă��������Ȃ��l��-";
	close;
}

ra_temple.gat,172,112,5	script	���N�M�k	921,{
	mes "[�n�[�X]";
	mes "�F�`�I�@�����A�����H";
	mes "�����A���������H�@���������H";
	next;
	mes "[�n�[�X]";
	mes "�������Ǒ�l�͒��Ԃɂł��Ȃ�����";
	mes "�������֍s���āI";
	close;
}

ra_temple.gat,179,161,7	script	���N�M�k	921,{
	mes "[�W�J]";
	mes "�V�[�b�I";
	mes "�B���V���Ă�́I";
	next;
	mes "[�W�J]";
	mes "���������Ⴄ�B";
	mes "�������֍s���āI";
	mes "�����A�S���܉�������񂾂���I";
	close;
}

ra_temple.gat,77,116,7	script	���N�M�k	921,{
	mes "[�G�~�b�g]";
	mes "���b!!�@�т����肵��!!";
	mes "�S���Ǝv������I";
	mes "����������ǂ����Ă����́I";
	mes "�����A�������֍s���āI";
	close;
}

ra_temple.gat,167,155,4	script	�����M�k	914,{
	mes "[���Y]";
	mes "�V�b�I";
	mes "�Â���!!";
	next;
	mes "[���Y]";
	mes "�c�c";
	next;
	mes "[���Y]";
	mes "�������s���Ă�I";
	mes "���������Ⴄ��I";
	next;
	if(select("�������Ă�́H","�킩����")==2) {
		mes "[���Y]";
		mes "�V�b!!";
		close;
	}
	mes "[���Y]";
	mes "����΂킩��ł��傤�H";
	mes "���Ȃ����������Ȃ��H";
	mes "�T�{���Ă��!!";
	mes "�܂������A�h���������ȁ[�I";
	next;
	mes "[���Y]";
	mes "�������s���Ă��Ă�!!";
	close;
}

//============================================================
// �t���C����_�a ����NPC
//------------------------------------------------------------
ra_temin.gat,138,63,4	script	�q���̐M�k	914,{
	mes "[�q���̐M�k]";
	mes "���̃~���~�������񂶂�����I";
	next;
	menu "�~���~���H",-;
	emotion 28;
	mes "[�q���̐M�k]";
	mes "�~���~���͂ˁA";
	mes "���ŏE�������������Ȃ́B";
	mes "��������Ă�������A";
	mes "�撣���Ċŕa�����̂Ɂc�c";
	mes "���������c�c";
	next;
	mes "[�q���̐M�k]";
	mes "���c�l�ɐ����Ԃ点�Ă�����������";
	mes "�������Ǝv���񂾂��ǁc�c";
	mes "�����́A�L�����Č�����Ȃ��c�c";
	mes "���c�l�͂ǂ��ɂ���������́H";
	mes "����ɁA�����͂ǂ��H";
	close;
}

ra_temin.gat,287,88,6	script	�M�k���N�A	927,{
	mes "[�M�k���N�A]";
	mes "���̉ԁc�c�ǂ��ł��H";
	mes "�C�ɓ���܂������H";
	mes "�������ڑI�сA�����ɏ������Ԃł��B";
	next;
	mes "[�M�k���N�A]";
	mes "�n���ȉԂ́A�ł���΂�Ȃ�����";
	mes "������ƂĂ����邭�����ł��I";
	mes "�Ԃ͗D�����������S��";
	mes "�����Ă���̂ł��B";
	mes "�����ł��傤�H";
	close;
}

ra_temin.gat,228,303,4	script	�M�k�t���W�A	926,{
	mes "[�M�k�t���W�A]";
	mes "����́A���_�t���C���l�̕�����";
	mes "��Ӓ��F�葱�����̂�";
	mes "����܂���ł����B";
	mes "���܂������ǁA";
	mes "�t���C���l���v����";
	mes "���̔�ꂳ���������ł��I";
	close;
}

ra_temin.gat,230,303,2	script	�M�k�t���W�A	926,{
	mes "[�M�k�t���W�A]";
	mes "�{���ɗ��h�Ȏ����Ȃ����܂����ˁB";
	mes "���_�t���C���l�����Ȃ���";
	mes "�J�߂Ă���������ł��傤�B";
	close;
}

//============================================================
// �t���C����_�a�N�G�X�g
//- Registry -------------------------------------------------
// RA_1QUE -> 0�`16
//------------------------------------------------------------
ra_temple.gat,116,174,3	script	�l�}#ra	920,{
	if($RachelDonate < 10000) {
		switch(RA_1QUE) {
		case 0:
			cutin "ra_nemma03",2;
			mes "[�l�}�_��]";
			mes "����ɂ��́B���l����B";
			mes "�_�a�ւ悤�����B";
			mes "���̌�p�ł����H";
			next;
			if(select("�ό��ɗ��܂���","�Q�q�����悤�Ɓc�c")==1) {
				cutin "ra_nemma01",2;
				mes "[�l�}�_��]";
				mes "�_�l�Ƃ̐����ɂȂ��݂������O���̕���";
				mes "�悭�ό��ɂ�������Ⴂ�܂��B";
				mes "������育���ɂȂ��Ă��������B";
				close2;
				cutin "ra_nemma01",255;
				end;
			}
			mes "[�l�}�_��]";
			mes "����I��V���������ł���ˁB";
			mes "���傤�ǂ悩������I";
			mes "�܂��Ȃ��_�a����Â��邨�Ղ肪";
			mes "�n�܂�܂��B";
			next;
			mes "[�l�}�_��]";
			mes "�����łȂ�ł����c�c";
			mes "���݁A�Z�X�����j���_�a�ł�";
			mes "���Ղ�ׂ̈̌������󂯕t���Ă܂��B";
			next;
			emotion 2;
			cutin "ra_nemma01",2;
			mes "[�l�}�_��]";
			mes "�_�l�ɕ�����Ղ�ł�����A";
			mes "�������񌣋������ĖႤ��";
			mes "�������ł����c�c�����ł͂���܂���I";
			mes "��Ԃ́A�C�����I�C�����ł�!!";
			next;
			mes "[�l�}�_��]";
			mes "���������Ղ�̈�ł��̂Łc�c";
			mes "�h�i�ȐM�k���猣���ȂǁA��";
			mes "�������_���l�����܂����ǁc�c";
			next;
			mes "[�l�}�_��]";
			mes "���������A�Y���Ƃ���ł�����I";
			mes "���ƍ��I�@���������Ē�����";
			mes "����ɂ��ꖇ�A";
			mes "���I���������グ�Ă��܂��I";
			next;
			mes "[�l�}�_��]";
			mes "���Ȃ璊�I�ŁA";
			mes "�_�a�q�ɓ���^0000FF�f�G�Ȃ���^000000��";
			mes "������܂�����I";
			mes "�ƌ����Ă��A���������邩��";
			mes "���I����ł����ǁc�c";
			next;
			cutin "ra_nemma03",2;
			mes "[�l�}�_��]";
			mes "���������Ē����܂����H";
			next;
			if(select("������","�͂�")==1) {
				cutin "ra_nemma01",2;
				mes "[�l�}�_��]";
				mes "�����ł����c�c";
				mes "�c�O�ł����d�����Ȃ��ł���ˁB";
				mes "�_�̈��A�_�̏j���B";
				mes "���͔ނ̏�ƂȂ�A";
				mes "�ǂ��܂ł��M���̂��΂ɁB";
				close2;
				cutin "ra_nemma01",255;
				end;
			}
			mes "[�l�}�_��]";
			mes "�������A�������Ē����܂����H";
			mes "�����A1��50000�[�j�[�ŁA";
			mes "��x�ɁA3���܂Ō������ł��܂��B";
			mes "�����Ɍ����Ƃ����O�����������������B";
			break;
		case 1:
			cutin "ra_nemma03",2;
			mes "[�l�}�_��]";
			mes "����ɂ��́B���l����I";
			mes "���I";
			mes "���̊ԁA�������Ă������������ł��ˁB";
			mes "�m���c�c�����O�́c�c";
			mes strcharinfo(0)+ "�l�I";
			next;
			cutin "ra_nemma01",2;
			mes "[�l�}�_��]";
			mes "���������āA���������������ɗ���";
			mes "������������ł����H";
			next;
			switch(select("�������ɗ��܂���","�_�a�����悤�Ǝv���ė��܂���","�Q�q���ɗ��܂���","���Ȃ��ɉ�����āc�c")) {
			case 1:
				cutin "ra_nemma01",2;
				mes "[�l�}�_��]";
				mes "�܂����Ē�����Ȃ�āI";
				mes "���肪�Ƃ��������܂��B";
				mes "�����͂������A�������Ē����܂����H";
				mes "�����A1��50000�[�j�[�ŁA";
				mes "��x�ɁA3���܂Ō������ł��܂��B";
				mes "�����Ɍ����Ƃ����O�����������������B";
				break;
			case 2:
				mes "[�l�}�_��]";
				mes "�_�a�̌�ē��́A�����̈ē��f�X�N�ɂ�";
				mes "�p�m�_�����S�����Ă���܂��B";
				next;
				mes "[�l�}�_��]";
				mes "�ޏ��́A���I���̌������s���Ă���";
				mes "�_�a�q�ɓ���^0000FF�f�G�Ȃ���^000000��";
				mes "�������Ă���܂���B";
				mes "���͖ʓ|�L�����Ă���悤�ł����c�c";
				next;
				mes "[�l�}�_��]";
				mes "�p�m�_���ɂ��q�˂ɂȂ�΁A";
				mes "�ڂ����������Ă���܂���B";
				mes "�����c�c";
				close2;
				cutin "ra_nemma01",255;
				end;
			case 3:
				mes "[�l�}�_��]";
				mes "�@���̈Ⴂ�ȂǋC�ɂ�����";
				mes "����A���_�t���C���l��";
				mes "�䈥�A�Ȃ����Ă��������B";
				mes "���ł����}���Ă��܂���B";
				close2;
				cutin "ra_nemma01",255;
				end;
			case 4:
				mes "[�l�}�_��]";
				mes "�����ɗ��Ă�����������ł��ˁI";
				mes "���c�c�H�Ⴂ�܂��H";
				close2;
				cutin "ra_nemma01",255;
				end;
			}
			break;
		}
		next;
		if(select("1��","2��","3��","��������߂�")==4) {
			cutin "ra_nemma01",2;
			mes "[�l�}�_��]";
			mes "�����������Ă��Ȃ����ł�";
			mes "���_�t���C���l�͌������";
			mes "���������܂��c�c";
			mes "�ł́A�悢������c�c";
			close2;
			cutin "ra_nemma01",255;
			end;
		}
		set '@num,@menu;
		cutin "ra_nemma01",2;
		mes "[�l�}�_��]";
		mes "�ł́A" +strcharinfo(0)+ "�l�A";
		mes '@num+ "���A" +('@num*50000)+ "�[�j�[����������";
		mes "������̂ł��ˁH";
		mes "��낵���ł����H";
		next;
		if(select("������","�͂�")==1) {
			mes "[�l�}�_��]";
			mes "�����A�������킹������Ȃ�����";
			mes "���̋@��ł��\���܂����H";
			mes "���_�t���C���l�͑҂��Ă��������܂��B";
			mes "����ł́A�悢������c�c";
			close2;
			cutin "ra_nemma01",255;
			end;
		}
		if(Zeny < '@num*50000) {
			mes "[�l�}�_��]";
			mes "�\���󂠂�܂��񂪁c�c";
			mes "������������Ȃ��悤�ł��ˁB";
			next;
			mes "[�l�}�_��]";
			mes "�������A�C�����̖��ł�����A";
			mes "���z�̑召�́A���Ȃ��̂ł����c�c";
			mes "���I���Ǘ��ׂ̈Ɍ�����";
			mes "��߂Ă���̂Łc�c";
			next;
			mes "[�l�}�_��]";
			mes "�܂��̂��z����";
			mes "���҂����Ă��܂�����I";
			close2;
			cutin "ra_nemma01",255;
			end;
		}
		if(checkweight(7570,'@num) == 0) {
			cutin "ra_nemma02",2;
			mes "[�l�}�_��]";
			mes "����c�c�ו��������ς��ł��ˁB";
			mes "���I�������n���ł������ɂ���܂���B";
			mes "�q�ɐ��������Ē����܂����H";
			next;
			cutin "ra_nemma01",2;
			mes "[�l�}�_��]";
			mes "�����͉��߂āA���󂯂������܂��B";
			mes "���҂����Ă��܂��ˁB";
			close2;
			cutin "ra_nemma01",255;
			end;
		}
		set Zeny,Zeny-('@num*50000);
		getitem 7570,'@num;
		set RA_1QUE,1;
		set $RachelDonate,$RachelDonate+'@num;
		if($RachelDonate >= 10000) {	//���b�Z�[�W���擾
			cutin "ra_nemma04",2;
			mes "[�l�}�_��]";
			mes "���肪�Ƃ��������܂��I";
			mes "���_�t���C���l�̌���삪";
			mes "����񎖂��c�c";
			close2;
			cutin "ra_nemma01",255;
			end;
		}
		cutin "ra_nemma03",2;
		mes "[�l�}�_��]";
		mes "���肪�Ƃ��������܂��I";
		mes "���� " +(10000-$RachelDonate)+ "�����������Ē�����";
		mes "�������I������\��ł��B";
		next;
		mes "[�l�}�_��]";
		mes "���z�ɒB����܂ł́A�����Ō�����";
		mes "�s�����ɂȂ��Ă��܂��̂ŁA";
		mes "�悩������A�܂��������Ă��������ˁB";
		mes "���_�t���C���l�̌���삪";
		mes "����񎖂��c�c";
		close2;
		cutin "ra_nemma01",255;
		end;
	}
	switch(RA_1QUE) {
	case 0:
	case 1:
		cutin "ra_nemma02",2;
		mes "[�l�}�_��]";
		mes "����ɂ��́c�c";
		mes "�n�@�c�c";
		next;
		mes "[�l�}�_��]";
		mes "�c�c";
		mes "����������A�_�a�̔����J���Ȃ��āc�c";
		mes "���낻��A����Ȃ��Ƃ����Ȃ��̂Ɂc�c";
		next;
		mes "[�l�}�_��]";
		mes "���낤�Ƃ�����A�����J���Ȃ��āc�c";
		mes "���X�A�J���Ȃ����������ł����c�c";
		next;
		mes "[�l�}�_��]";
		mes "�ǂ����_�a�����Ă����A";
		mes "�Z�p�҂������������b�N�V�X�e����";
		mes "���t�����炵���̂ł��B";
		next;
		mes "[�l�}�_��]";
		mes "�Â��V�X�e���ł��̂ŁA���͂���";
		mes "�O�������ł��Ȃ����c�c";
		next;
		mes "[�l�}�_��]";
		mes "����̗l�Ɍ̏Ⴕ����";
		mes "�����A�҂����Ȃ������̂ł��B";
		next;
		mes "[�l�}�_��]";
		mes "�ł��c�c";
		mes "����͏������߂����ł���ˁB";
		mes "�ǂ����悤�c�c����Ȃ���c�c";
		next;
		mes "[�l�}�_��]";
		mes "���������c�c";
		next;
		mes "[�l�}�_��]";
		mes "�ǂ����悤�c�c";
		mes "�p�m�`�I�@���������c�c";
		set RA_1QUE,2;
		break;
	default:
		cutin "ra_nemma02",2;
		mes "[�l�}�_��]";
		mes "���������΁c�c";
		mes "����_�����畷�����b�Ȃ�ł����A";
		mes "�_�a�̔��ȊO�̏ꏊ��������ɓ�����";
		mes "�C�^�Y��������q���������";
		mes "�����������c�c";
		next;
		mes "[�l�}�_��]";
		mes "�N�����������c�c";
		mes "���ȊO�̏ꏊ���Ăǂ����낤�c�c";
		next;
		mes "[�l�}�_��]";
		mes "���������c�c";
		mes "�p�m�`�I�@�ǂ����悤�c�c";
		break;
	case 11:
		cutin "ra_nemma04",2;
		mes "[�l�}�_��]";
		mes "���I";
		mes strcharinfo(0)+ "�l�I";
		next;
		mes "[�l�}�_��]";
		mes "�����A�S�z���Ȃ��Ă����ł���I";
		mes "��قǔ����J������ł��I";
		mes "�{���ɊJ���Ă悩�����c�c";
		next;
		mes "[�l�}�_��]";
		mes "�p�m�Ɏd����C���Ă���";
		mes "���߂ċN�������Ȃ�ł���c�c";
		mes "������������ǂ����悤�ƁA";
		mes "�S�z���܂������ǁc�c";
		next;
		mes "[�l�}�_��]";
		mes "�����I";
		mes "�������������J�����̂�";
		mes "�v�킸�A�O�֏o�Ă��܂����c�c";
		next;
		cutin "ra_nemma02",2;
		mes "[�l�}�_��]";
		mes "�����A�܂������J���Ȃ��Ȃ�����";
		mes "�ǂ����܂��傤�c�c";
		next;
		mes "[�l�}�_��]";
		mes "�q�[���c�c";
		next;
		mes "[�l�}�_��]";
		mes "����c�c";
		mes "���Ƃ��������c�c";
		set RA_1QUE,12;
		break;
	case 12:
	case 13:
		cutin "ra_nemma04",2;
		mes "[�l�}�_��]";
		mes "�������I�������";
		mes "���́c�c";
		next;
		mes "[�l�}�_��]";
		mes "����H�@���ł�������??";
		mes "���[��c�c";
		next;
		mes "[�l�}�_��]";
		mes "�p�m�ɕ����Ă��Ȃ��Ɓc�c";
		break;
	case 14:
		cutin "ra_nemma03",2;
		mes "[�l�}�_��]";
		mes "���I�@�������I";
		mes "�v���o���܂����I";
		mes "�ԉ΂��~�����̂ł����c�c";
		next;
		cutin "ra_nemma01",2;
		mes "[�l�}�_��]";
		mes strcharinfo(0)+ "�l�Ȃ�";
		mes "�����ɂł���ɓ�����܂���ˁI";
		mes "�����ė��Ē�����΁c�c";
		mes "�_�a�̏j���������グ�܂��傤�I";
		next;
		cutin "ra_nemma04",2;
		mes "[�l�}�_��]";
		mes "�ԉ΂�20������Ώ\���ł��B";
		mes "��낵�����肢�������܂��ˁI";
		set RA_1QUE,15;
		break;
	case 15:
		cutin "ra_nemma03",2;
		mes "[�l�}�_��]";
		mes "���肢���܂����ԉ�20�c�c";
		mes "�����ė��Ē����܂������H";
		next;
		if(select("�͂�","����[�A���ꂪ�܂��c�c")==2) {
			cutin "ra_nemma01",2;
			mes "[�l�}�_��]";
			mes "�����ł����c�c";
			mes "�d������܂���B";
			next;
			mes "[�l�}�_��]";
			mes "�{���Ɏc�O�ł��c�c";
			mes "�{���Ɂc�c";
			break;
		}
		cutin "ra_nemma01",2;
		mes "[�l�}�_��]";
		mes "�ǂ�ǂ�c�c";
		next;
		if(countitem(12018) < 20) {
			cutin "ra_nemma02",2;
			mes "[�l�}�_��]";
			mes "���́A20�ł͖����悤�ł����A";
			mes "�}��������ł͂���܂��񂪁c�c�B";
			mes "20�����Ȃ��ƍ���܂��B";
			next;
			mes "[�l�}�_��]";
			mes "�c�c";
			mes "�Ƃ肠�����A";
			mes "20�p�ӂ��Ă��������ˁB";
			mes "���肢���܂��B";
			break;
		}
		cutin "ra_nemma04",2;
		mes "[�l�}�_��]";
		mes "���肪�Ƃ��������܂��I";
		mes "���_�t���C���l�̌���삪";
		mes "����񎖂��c�c";
		set RA_1QUE,16;
		delitem 12018,20;
		if(checkre())
			getexp 20000,0;
		else
			getexp 200000,0;
		next;
		mes "-�l�}�_���̏j���𕷂���";
		mes "�@�S�����炮�C������-";
		next;
		cutin "ra_nemma03",2;
		mes "[�l�}�_��]";
		mes "���c�l���A����тɂȂ�ł��傤�I";
		break;
	case 16:
		cutin "ra_nemma01",2;
		mes "[�l�}�_��]";
		mes "�Z�X�����j���_�a�ւ悤�����I";
		break;
	}
	close2;
	cutin "ra_nemma01",255;
	end;
}

ra_temin.gat,170,46,4	script	�p�m	920,{
	switch(RA_1QUE) {
	case 0:
	case 1:
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "����ɂ��́B";
		next;
		switch(select("���I���̌��������肢���܂�","�_�a�̈ē������肢���܂�","�����A����ɂ���")) {
		case 1:
			break;
		case 2:
			cutin "ra_fano01",2;
			mes "[�p�m�_��]";
			mes "���̌�ɂ��镔�����A��`���ł��B";
			mes "��̊K�ɂ́A���c�l�ɉy���ł���";
			mes "�y����������܂����A��ʂ̕���";
			mes "���c�l�ɉy������ɂ́A";
			mes "���ʂȋ��𓾂�K�v������܂��B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c";
			next;
			mes "[�p�m�_��]";
			mes "�c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c";
			next;
			cutin "ra_fano02",2;
			mes "[�p�m�_��]";
			mes "�_�a�́A�_�Ɏd����҂�";
			mes "�_�ɋF��������ꏊ�B";
			mes "�ό��n�ł͂Ȃ�����";
			mes "�������Ē��������ł��B";
			next;
			cutin "ra_fano03",2;
			mes "[�p�m�_��]";
			mes "�������獶�E�ɐL�т�L���ɂ�";
			mes "��_���̎�������6����܂��B";
			next;
			mes "[�p�m�_��]";
			mes "�ł����A��_���̋������ł�";
			mes "����܂���B";
			next;
			mes "[�p�m�_��]";
			mes "��������ꍇ�́A";
			mes "���̌���ł́A����܂��񂪁c�c";
			mes "������O�ł���ˁB";
			close2;
			cutin "ra_fano01",255;
			end;
		case 3:
			mes "[�p�m�_��]";
			mes "�_�a���ł�";
			mes "�Â��ɂ��Ă��������B";
			close2;
			cutin "ra_fano01",255;
			end;
		}
		break;
	default:
		cutin "ra_fano02",2;
		mes "[�p�m�_��]";
		mes "���͎�荞�ݒ��Ȃ̂�";
		mes "���߂ė��Ă��������B";
		close2;
		cutin "ra_fano01",255;
		end;
	case 12:
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "����ɂ��́B";
		next;
		switch(select("���I���̌��������肢���܂�","�_�a�̈ē������肢���܂�","���́c�c")) {
		case 1:
			cutin "ra_fano01",2;
			mes "[�p�m�_��]";
			mes "�_�a���I���̎��ł����H";
			mes "���܂��ɂ���������Ă�Ȃ�āc�c";
			mes "�������A�܂������͏o���܂����c�c";
			next;
			cutin "ra_fano03",2;
			mes "[�p�m�_��]";
			mes "�n�@�c�c";
			mes "�܂����̑q�ɂɁc�c";
			mes "�c�c�`�b�I";
			mes "�u�c�u�c�c�c";
			next;
			break;
		case 2:
			cutin "ra_fano01",2;
			mes "[�p�m�_��]";
			mes "���̌�ɂ��镔�����A��`���ł��B";
			mes "��̊K�ɂ́A���c�l�ɉy���ł���";
			mes "�y����������܂����A��ʂ̕���";
			mes "���c�l�ɉy������ɂ́A";
			mes "���ʂȋ��𓾂�K�v������܂��B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c";
			next;
			mes "[�p�m�_��]";
			mes "�c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c";
			next;
			cutin "ra_fano02",2;
			mes "[�p�m�_��]";
			mes "�_�a�́A�_�Ɏd����҂�";
			mes "�_�ɋF��������ꏊ�B";
			mes "�ό��n�ł͂Ȃ�����";
			mes "�������Ē��������ł��B";
			next;
			cutin "ra_fano03",2;
			mes "[�p�m�_��]";
			mes "�������獶�E�ɐL�т�L���ɂ�";
			mes "��_���̎�������6����܂��B";
			next;
			mes "[�p�m�_��]";
			mes "�ł����A��_���̋������ł�";
			mes "����܂���B";
			next;
			mes "[�p�m�_��]";
			mes "��������ꍇ�́A";
			mes "���̌���ł́A����܂��񂪁c�c";
			mes "������O�ł���ˁB";
			close2;
			cutin "ra_fano01",255;
			end;
		case 3:
			cutin "ra_fano02",2;
			mes "[�p�m�_��]";
			mes "�͂��H";
			next;
			menu "�_�a�̊J���Ȃ������J�����l",-;
			mes "[�p�m�_��]";
			mes "���̘b�ł����H";
			mes "�킩��܂���B";
			next;
			menu "�l�}�_���́c�c",-;
			mes "[" +strcharinfo(0)+ "]";
			mes "�l�}�_���́c�c";
			mes "�p�m�_�����A���̎d���ɂ��Ă���";
			mes "���߂ċN�������̌̏��";
			mes "�ƂĂ��S�z���Ă��܂����B";
			next;
			mes "[�p�m�_��]";
			mes "���ꂪ�ǂ�������ł����H";
			mes "�l�}�_���́A���̑o�q�̎o�ł��B";
			mes "�S�z����͓̂�����O�Ȃ̂ł́H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�l�}�_���͔��̌̏�ɂ���";
			mes "���܂Ɍ̏�͂������ǁA";
			mes "�����ɒ������A�ƌ����Ă܂����B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�ł����A����̌̏�ɂ��ẮA";
			mes "���̂��A�_�a���ݓ����̘b�܂ł���";
			mes "���ʋ���Ă����悤�ł��B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "����̌̏�́A�\�����Ă��Ȃ��B";
			mes "�������́A�\��ɂȂ����������̂ł́H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�p�m�_���I";
			mes "�{���́A���Ȃ��Ƃ��̐_�a�ɂ�";
			mes "���炩�̔閧������̂ł͂Ȃ��ł����H";
			next;
			mes "[�p�m�_��]";
			mes "�c�c";
			set RA_1QUE,13;
			close2;
			cutin "ra_fano01",255;
			end;
		}
		break;
	case 13:
		cutin "ra_fano03",2;
		mes "[" +strcharinfo(0)+ "]";
		mes "���͕������̂ł��B";
		mes "�����J�������A�l�}�_����";
		mes "�܂��������������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����܂��Ă��܂������A";
		mes "�����_�a�ɂ����̂ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̌����������炠�Ȃ��̐��������";
		mes "�����J���܂�����ˁB";
		next;
		mes "[�p�m�_��]";
		mes "�c�c�c�c";
		next;
		mes "[�p�m�_��]";
		mes "�c�c";
		next;
		cutin "ra_fano01",2;
		mes "[�p�m�_��]";
		mes "�c�c���̐�c�́A";
		mes "�l�}�_���̐�c�ł�����܂����c�c";
		mes "�����ȘB���p�t�����������ł��B";
		next;
		mes "[�p�m�_��]";
		mes "���̕����c�����L�^�ɂ���";
		mes "���̐_�a�̌��ݒ��A�_�a�̒ǉ��@�\��";
		mes "�S�����鎖�ɂȂ��������ł��B";
		next;
		mes "[�p�m�_��]";
		mes "���́A�J�[�h���̓������u�c�c";
		mes "�����p�J�[�h�������ƁA";
		mes "�_�a�ɓ���Ȃ��悤�ɂ��鑕�u��";
		mes "�ォ��̖��߂ɂ���Đݒu���܂����B";
		next;
		mes "[�p�m�_��]";
		mes "���̃Z�X�����j���_�a�́c�c";
		mes "���͓����ė��Ă͂����Ȃ��c�c";
		mes "�N���ҁc�c�c�c";
		mes "�c�c����l�X��������";
		mes "�������z�肵�Ă��������ł��B";
		next;
		mes "[�p�m�_��]";
		mes "�ł����c�c���Ƃ��Ă̈Ӗ���";
		mes "�܂���������܂���ł����B";
		next;
		mes "[�p�m�_��]";
		mes "�\�����ꂽ�N���ҁc�c�́A���납";
		mes "�i���v�悪�A���邩�ǂ����c�c";
		mes "�����A���̍��Ɋ֐S������������";
		mes "���������̂ł��B";
		next;
		mes "[�p�m�_��]";
		mes "���ׁ̈A�J�[�h�͑S�Ĕp�����܂�����";
		mes "�����ɔ����瑕�u�����O�����́A";
		mes "���̂܂ܒu���Ă��������������Ƃ���";
		mes "�ӌ�������A�����Ɏc���Ă���̂ł��B";
		next;
		mes "[�p�m�_��]";
		mes "�����O����A���̓����V�X�e����";
		mes "�̏Ⴕ�Ă�Ǝo���畷���A����������";
		mes "�v���Ă܂����B";
		next;
		mes "[�p�m�_��]";
		mes "���̘B���p�Ɣ�ׂĂ��A������Ȃ�";
		mes "�����ɋ߂����̐_�a�̓����V�X�e����";
		mes "�̏Ⴞ�Ȃ�āc�c";
		next;
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "�����̏�������ꍇ�́A�V�X�e�����̂�";
		mes "���S�ɒ�~����d�g�݂Ȃ̂Ɂc�c";
		next;
		mes "[�p�m�_��]";
		mes "�J����������肵�Ă���ƌ�������";
		mes "�N�����p������Ă��Ȃ��J�[�h��";
		mes "�C�^�Y�������Ă���̂ł́A��";
		mes "�l���܂����B";
		next;
		cutin "ra_fano02",2;
		mes "[�p�m�_��]";
		mes "�c�c�����P�ɁA��c�ɑ΂���";
		mes "�v���C�h���ڂ�����܂�����������";
		mes "����܂��񂪁c�c�c�c";
		next;
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "���̂����A�{���Ɍ̏�Ȃ̂���";
		mes "�m���߂�`�����X�����܂����I";
		next;
		mes "[�p�m�_��]";
		mes "���͎d�����I���A��q���s���ׂ�";
		mes "��`���Ɍ������Ă��܂����B";
		next;
		mes "[�p�m�_��]";
		mes "���̎��A�_�a�����̖����肪";
		mes "�S���A�����Ă��܂����̂ł��B";
		next;
		mes "[�p�m�_��]";
		mes "�s�ӂ̏o�����ŁA�����Q�Ă��̂ł����A";
		mes "�K���A�������肪�������̂ŁA";
		mes "��`���֌������ĕ����čs����";
		mes "�K�i�̕����特�����܂����B";
		next;
		cutin "ra_fano02",2;
		mes "[�p�m�_��]";
		mes "�c�c�N�����c�c�c�c";
		mes "�������ڂ��Ă��܂����B";
		mes "�c�c�c�c����̕��ցB";
		next;
		mes "[�p�m�_��]";
		mes "����ɉ������邩�́A";
		mes "�_���ɂȂ����΂���̎��ɂ�";
		mes "�킩��Ȃ��̂ł����c�c�c�c";
		next;
		mes "[�p�m�_��]";
		mes "�N��������ɓ����Ă���Ԃ��Ȃ��A";
		mes "�c�c�c�c�c�c�傫���b�̋��ѐ���";
		mes "�\���悤�ȉ����������܂����B";
		next;
		mes "[�p�m�_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�|�������ł��B";
		next;
		mes "[�p�m�_��]";
		mes "���͍Q�ĂĔ��̑O�܂Ŗ߂�A";
		mes "��c���c�����閧�̍����t��";
		mes "�����܂����B";
		next;
		mes "[�p�m�_��]";
		mes "����ƁA���͍����t�ɔ�������";
		mes "�L�`���ƌ������������̂ł��B";
		next;
		cutin "ra_fano01",2;
		mes "[�p�m�_��]";
		mes "�c�c���̐�c��";
		mes "�C�ӂ̃C�Y���[�h�Ƃ����s�s��";
		mes "���܂������ƌ����܂��B";
		next;
		mes "[�p�m�_��]";
		mes "�������̎��ɔ����āA";
		mes "�閧�̌��t�������t�Ƃ���";
		mes "���̓������u�Ɏd�|���Ă������̂ł��B";
		mes "�����āA�J�[�h��p�����鎞�A";
		mes "���̍����t���q�������ɓ`���܂����B";
		next;
		mes "[�p�m�_��]";
		mes "�̏Ⴖ��Ȃ��Ǝv���Ă��܂����B";
		mes "�����āA�̏�ł͂���܂���ł����B";
		next;
		mes "[�p�m�_��]";
		mes "���҂����A��������Ŗ����ɉ������A";
		mes "���`�ɔ�����s�ׂ��s���Ă��āc�c";
		mes "������B���ׁA�c�����J�[�h���g��";
		mes "�N�ɂ������ʂ悤�������Ă����c�c";
		next;
		mes "[�p�m�_��]";
		mes "�c�c�c�c";
		mes "����ŁA�����ł����H";
		next;
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "���ꂪ�A�����m���Ă�S�Ăł��B";
		mes "���l�Ɍ������Ƃ���ő���ɂ���Ȃ���";
		mes "�E����邾���ł��傤�B";
		next;
		mes "[�p�m�_��]";
		mes "���Ȃ��͖ܘ_�̎��c�c�c�c";
		mes "�����E����܂���ˁB";
		next;
		mes "[�p�m�_��]";
		mes "����ł́A���͎����̎d����";
		mes "�߂�܂��B";
		set RA_1QUE,14;
		close2;
		cutin "ra_fano01",255;
		end;
	case 14:
	case 15:
	case 16:
		cutin "ra_fano03",2;
		break;
	}
	mes "[�p�m�_��]";
	mes "���I���̌������Ȃ����܂����H";
	next;
	if(select("�͂�","������")==2) {
		switch(RA_1QUE) {
		default:
			mes "[�p�m�_��]";
			mes "�����͂��ł��o���܂��B";
			mes "�K�v�Ȏ��́A�܂����Ă��������B";
			break;
		case 14:
			mes "[�p�m�_��]";
			mes "����ȏ�A���b�ł��鎖��";
			mes "����܂���B";
			break;
		case 15:
		case 16:
			mes "[�p�m�_��]";
			mes "�_�a�͊ό��n�ł͂���܂���I";
			break;
		}
		close2;
		cutin "ra_fano01",255;
		end;
	}
	if(countitem(7570) < 1) {
		cutin "ra_fano02",2;
		mes "[�p�m�_��]";
		mes "���́c�c";
		mes "���I�����ɒ񎦂��Ă��������B";
		if($RachelDonate < 10000) {
			mes "�_�a���I���́A�_�a�Ɍ������Ă��ꂽ";
			mes "���ɂ̂݁A���z�肵�Ă��܂��B";
			mes "�K�v�Ȃ�΁A�_�a�̑O�ɂ���l�}�_����";
			mes "�������s���Ă��������B";
		}
		else {
			mes "���݁A�V�������I���̔z�z��";
			mes "�s���Ă���܂���B";
			next;
			mes "[�p�m�_��]";
			mes "�����A�~�����̂ł���ΗF�B�⒇�Ԃ�";
			mes "����ł݂��炢�����ł����H";
		}
		next;
		cutin "ra_fano03",2;
		mes "[�p�m�_��]";
		mes "����ł́A���ɗp������܂�����";
		mes "�܂����Ă��������B";
		close2;
		cutin "ra_fano01",255;
		end;
	}
	if((MaxWeight - Weight) < 2000) {
		cutin "ra_fano02",2;
		mes "[�p�m�_��]";
		mes "��������O�ɁA���̏d�ꂵ��";
		mes "�ו����牽�Ƃ����Ă��������B";
		mes "�傫�����ł��o����";
		mes "�ǂ��������ł����H";
		close2;
		cutin "ra_fano01",255;
		end;
	}
	cutin "ra_fano01",2;
	mes "[�p�m�_��]";
	mes "���A�����グ�����͐_�a�q�ɂ�";
	mes "�����ԁA�����Ă������ł��B";
	mes "�����̂��Ԃ��ƌ������́A";
	mes "��X�̊��ӂ̋C�����Ǝv���Ă��������B";
	mes "����ł́B";
	delitem 7570,1;
	set '@rand,rand(100);
	if ('@rand >= 99) {
		switch(rand(10)) {
			case 0: getitem 616,1; break; //�Â��J�[�h�� 0.1%
			case 1:
			case 2: getitem 617,1; break; //�Â����F�̔� 0.2%
			case 3:
			case 4:
			case 5: getitem 603,1; break; //�Â����� 0.3%
			default: getitem 607,1; break; //�C�O�h���V���̎� 0.4%
		}
	}
	else if('@rand >= 92) getitem 644,1; //�v���[���g�{�b�N�X 7%
	else if('@rand >= 80) getitem 607,1; //�C�O�h���V���̎� 12%
	else if('@rand >= 69) getitem 505,1; //�|�[�V���� 11%
	else if('@rand >= 61) getitem 604,1; //�Ö؂̎} 8%
	else if('@rand >= 49) getitem 608,1; //�C�O�h���V���̎� 12%
	else if('@rand >= 44) getitem 518,1; //�n�`�� 5%
	else if('@rand >= 39) getitem 526,1; //���[�����[���[ 5%
	else  getitem 547,1; //�z���C�g�X�����|�[�V���� 39%
	close2;
	cutin "ra_fano01",255;
	end;
}

rachel.gat,242,37,4	script	���N	921,{
	if(RA_1QUE == 3) {
		mes "[���N]";
		mes "�����Ă�̂��H";
		mes "�I�����A�W�����P���̗��K���Ă��";
		mes "����Ȃɖʔ����H";
		next;
		mes "[���N]";
		mes "�p������������";
		mes "�������֍s���Ă�I";
		next;
		mes "[���N]";
		mes "���[�I";
		mes "�������s���Ă��Ă΁I";
		next;
		mes "[���N]";
		mes "����ȂɉɂȂ�A";
		mes "�_�a�̑��ł��̂����Ă�΁H";
		mes "�܂����������c�c";
		close;
	}
	mes "[���N]";
	mes "�I���̓�������ɕ��ł�ȁI";
	mes "���łȂ��ł��Ă΁I";
	next;
	mes "[���N]";
	mes "���łȂ��ł��Č������ł���H";
	mes "������!!";
	next;
	mes "[���N]";
	mes "�ǂ����痈���́H";
	next;
	mes "[���N]";
	mes "�K�C�R�N�H";
	mes "�K�C�R�N??";
	next;
	mes "[���N]";
	mes "�K�C�R�N���ĉ��H";
	next;
	mes "[���N]";
	mes "���[��B�m��Ȃ��I";
	mes "���������I";
	next;
	mes "[���N]";
	mes "�L�����f�B�͍D���H";
	if(RA_1QUE != 2)
		close;
	next;
	switch(select("������","����I","�}�W�D���I","�ʂɁc�c")) {
	case 1:
		mes "[���N]";
		mes "�Ӂ[��B";
		mes "�킩�����B";
		close;
	case 2:
		if(rand(2)) {
			mes "[���N]";
			mes "�����Ȃ񂾁B";
			next;
			mes "[���N]";
			mes "��l�Ȃ̂Ɂc�c";
			next;
			mes "[���N]";
			mes "��l���L�����f�B���D���Ȃ񂾂��āI";
			next;
			mes "[���N]";
			mes "���E�E�E�P�E��[!!";
			close;
		}
		break;
	case 3:
		if(rand(2)) {
			mes "[���N]";
			mes "�����Ȃ񂾁B";
			next;
			mes "[���N]";
			mes "�����N������l���I";
			next;
			emotion 2;
			mes "[���N]";
			mes "��l���L�����f�B���D���Ȃ񂾂��āI";
			next;
			mes "[���N]";
			mes "���E�E�E�P�E��[!!!!";
			close;
		}
		break;
	case 4:
		mes "[���N]";
		mes "��l���ˁ`";
		mes "�ւ��`";
		mes "�K�C�R�N���ď��ɂ͑�l�������Ȃ��́H";
		mes "�L�����f�B�͍D������Ȃ��́H";
		next;
		mes "[���N]";
		mes "�D������Ȃ��񂾁`";
		mes "�����Ȃ񂾁`";
		close;
	}

	mes "[���N]";
	mes "�z���g�H";
	mes "����A�����Ă��ˁH";
	next;
	mes "[���N]";
	mes "���傤�����I";
	next;
	mes "[���N]";
	mes "�������傤������I�@�����I";
	mes "������Ă�!!";
	next;
	if(countitem(529)) {
		mes "[���N]";
		mes "���ꂭ�ꂭ�ꂭ��!!!!";
		mes "�c�c";
		mes "���̃L�����f�B��������";
		mes "�����������Ă�����I";
		next;
		if(select("������","���₾")==2) {
			mes "[���N]";
			mes "�q���ł��Ȃ��̂ɁA";
			mes "����ȂɃL�����f�B���D���Ȃ́H";
			mes "�����ɂȂ邼�I�@�A�b�J���x�[��!!";
			close;
		}
		mes "[���N]";
		mes "��[����[���I";
		next;
		mes "[���N]";
		mes "�ł��A�I���͂����q������Ȃ��񂾁I";
		mes "�L�����f�B�Ȃ�Ă���Ȃ���I";
		mes "�q��������A";
		mes "�L�����f�B�ŗU����Ǝv���Ȃ�āI";
		mes "�܂��܂����ˁ`�B";
		next;
		mes "[���N]";
		mes "�G�w�w�I�@������I";
		mes "���Ⴀ�A���ʂɋ����Ă�����I";
		next;
		mes "[���N]";
		mes "�_�a�ɂˁB";
		mes "���������J���Ă�ꏊ������񂾂�B";
		mes "���܂ɂ��������Ă�ƁA";
		mes "�_���̂������񂽂������܂��Ă�񂾁I";
		next;
		mes "[���N]";
		mes "������l�����܂���Ȃ�āc�c";
		mes "�I�������ɂ͌��܂���Ȃ��Č����ȂɁI";
		mes "���������I";
		next;
		mes "[���N]";
		mes "���[��c�c";
		mes "�K�C�R�N�̃L�����f�B���Ă��������H";
		mes "����Ă����΂悩�������ȁc�c";
		next;
		mes "[���N]";
		mes "�ȁc�c���������ĂȂ���I";
		mes "��l�́A�������s�����āI";
		set RA_1QUE,3;
		close;
	}
	mes "[���N]";
	mes "�����Ė��������H";
	mes "����ł��A�L�����f�B�D�����ƌ�����H";
	mes "�I�������āI�@���Ă��Ă΁I";
	mes "�|�P�b�g�ɂ����ς��L�����f�B!!";
	next;
	mes "[���N]";
	mes "�ف[��!!";
	mes "�M�b�V������ł���H";
	next;
	mes "[���N]";
	mes "�L�����f�B�D���Ȃ�A";
	mes "���ꂭ�炢�͊�{�ł���H";
	mes "�ււ�!!";
	next;
	mes "[���N]";
	mes "��A�����悤���H";
	next;
	mes "[���N]";
	mes "�A�b�J���x�[�I";
	mes "��������񂩁I";
	next;
	mes "[���N]";
	mes "�c�c���˂��H";
	next;
	mes "[���N]";
	mes "���˂��ł���H";
	next;
	mes "[���N]";
	mes "���傤���Ȃ��ȁ[�I";
	mes "����Ȋ炷��Ȃ�I";
	mes "�I�����������A�����Ă�邩�炳�I";
	mes "���E���E���E�ƁI";
	next;
	if(select("������I","���H")==1) {
		mes "[���N]";
		mes "���˂�����Ă�!!";
		close;
	}
	mes "[���N]";
	mes "���傤���Ȃ��Ȃ��`";
	mes "���Ⴀ�A���ʂɋ����Ă�����I";
	next;
	mes "[���N]";
	mes "�_�a�ɂˁB";
	mes "���������J���Ă�ꏊ������񂾂�B";
	mes "���܂ɂ��������Ă�ƁA";
	mes "�_���̂������񂽂������܂��Ă�񂾁I";
	next;
	mes "[���N]";
	mes "������l�����܂���Ȃ�āc�c";
	mes "�I�������ɂ͌��܂���Ȃ��Č����ȂɁI";
	mes "���������I";
	next;
	mes "[���N]";
	mes "�@���������H";
	mes "����A�I���͖Z��������";
	mes "�܂��A��ŗV�ڂ���!!";
	set RA_1QUE,3;
	close;
}

ra_temple.gat,119,180,0	script	�_�a����	45,1,1,{
	if($RachelDonate < 10000 || RA_1QUE >= 10) {
		warp "ra_temin.gat",169,23;
		end;
	}
	mes "==�h�A���܂��Ă���B==";
	next;
	menu "�R��j��B",-,"��������o���B",-;
	emotion 23,"�l�}#ra";
	mes "[�l�}�_��]";
	mes "���̂悤�Ȏ������Ă͂����܂���I";
	close;
}

que_rachel.gat,63,82,0	script	��	111,{
	mes "-�����J���Ă���-";
	next;
	if(select("�o��","�o�Ȃ�")==2) {
		mes "-�����ƒ��ׂĂ���ɂ��悤-";
		close;
	}
	warp "ra_temple.gat",73,208;
	end;
}

ra_temple.gat,67,209,0	script	ra_tem0	139,3,3,{
	if(RA_1QUE < 3 || RA_1QUE > 10)
		end;
	if(RA_1QUE == 3) {
		mes "-���������J���Ă���̂�������-";
		next;
		if(select("��������","����")==1) {
			mes "-����ɓ����ẮA";
			mes "�@�܂����Ȃ����c�c-";
			close;
		}
		mes "-�����J���Ă��鑋���y��������";
		mes "�@�������Ă���l������邭�炢";
		mes "�@�J���Ă��܂����I-";
		next;
		mes "-�����A��������������q����";
		mes "�@�I�C����h���Ă����݂�����-";
		close2;
		warp "que_rachel.gat",62,82;
		end;
	}
	mes "-���������܂����H-";
	next;
	if(select("����","����Ȃ�")==2) {
		mes "-�O���������@�́A";
		mes "�@���͂��̑������Ȃ�-";
		close;
	}
	close2;
	warp "que_rachel.gat",62,82;
	end;
}

que_rachel.gat,60,80,0	script	ra_tem1	139,5,5,{
	if(RA_1QUE != 3)
		end;
	mes "-�Â��I";
	mes "�@�s���R�ȂقǈÂ��I-";
	set RA_1QUE,4;
	close;
}

que_rachel.gat,59,112,0	script	ra_tem2	139,10,10,{
	if(RA_1QUE != 4)
		end;
	mes "-����c�c����c�c";
	mes "�@��`�����̘L�����特����������-";
	set RA_1QUE,5;
	close;
}

que_rachel.gat,94,139,0	script	ra_tem3	139,10,10,{
	if(RA_1QUE != 5)
		end;
	mes "-����c�c����c�c";
	mes "�@�K�i�̕����特����������-";
	set RA_1QUE,6;
	close;
}

que_rachel.gat,132,70,0	script	ra_tem4	139,5,5,{
	if(RA_1QUE != 6)
		end;
	mes "�h�J��!!";
	next;
	mes "-�K�i�̏ォ�牽�������������Ƌ���";
	mes "�@����������������-";
	set RA_1QUE,7;
	close;
}

que_rachel.gat,28,315,0	script	ra_tem5	139,5,5,{
	switch(RA_1QUE) {
	case 7:
		mes "-���ɉ������Ă���̂��A������-";
		next;
		if(select("�ڂ������ׂ�","��������")==2)
			close;
		mes "-���[��c�c";
		mes "�@�Â��Ă����ƌ����Ȃ�-";
		next;
		mes "�c�c";
		next;
		mes "-�S�̓����c�c�H";
		mes "�@����I���̓����H-";
		set RA_1QUE,8;
		close;
	case 8:
		mes "-���������ׂ�����";
		mes "�@�����������Ȃ��ȁc�c-";
		next;
		if(select("�ڂ������ׂ�","���̂��̂�{���Ă݂�")==2) {
			mes "-���̂��̂𒲂ׂ鎖�ɂ���-";
			close;
		}
		mes "-���́A�܂��ł܂��Ă��Ȃ����A";
		mes "�@�g�����͂Ȃ��c�c-";
		next;
		mes "�c�c";
		next;
		mes "-��l�̐l�Ԃ��������̗ʂ�";
		mes "�@�͂邩�ɒ����Ă���B";
		mes "�@�����������������ȁH-";
		set RA_1QUE,9;
		close;
	case 9:
		mes "-����ȏ�A�����ɂ���̂�";
		mes "�@�댯�ȋC������-";
		close;
	default:
		end;
	}
}

que_rachel.gat,170,37,0	script	�p�m#ra1	139,5,5,{
	if(RA_1QUE != 9)
		end;
	mes "[???]";
	mes "����";
	mes "�_�l������";
	mes "����";
	mes "�����B";
	next;
	mes "[???]";
	mes "�܂�";
	mes "�p�ӂ����҂�";
	mes "���Ȃ�";
	mes "�����B";
	next;
	mes "[???]";
	mes "��������";
	mes "�C�Y���[�h";
	next;
	mes "!!!!!";
	mes "-�p�m�_���̐�!?-";
	next;
	mes "-����A�p�m�_���́c�c";
	mes "�@���̊O�ɂ���͂�����c�c�H-";
	next;
	mes "-�ł́A���̐��́c�c-";
	set RA_1QUE,10;
	close;
}
que_rachel.gat,175,37,0	duplicate(�p�m#ra1)	�p�m#ra2	139,5,5
que_rachel.gat,180,37,0	duplicate(�p�m#ra1)	�p�m#ra3	139,5,5
que_rachel.gat,165,37,0	duplicate(�p�m#ra1)	�p�m#ra4	139,5,5
que_rachel.gat,160,37,0	duplicate(�p�m#ra1)	�p�m#ra5	139,5,5

que_rachel.gat,169,18,0	script	�_�a�o��	45,2,2,{
	mes "-�����܂��Ă���-";
	next;
	switch(select("�����Ă݂�","����𒲂ׂ�","�R��","��������o���ĉ�")) {
	case 1:
		if(RA_1QUE != 10) {
			mes "-�d�����͂т��Ƃ����Ȃ�-";
			close;
		}
		mes "-�т��Ƃ����Ȃ������Ȕ���";
		mes "�@�����Ƃ����c�c-";
		break;
	case 2:
		mes "-���̎��ӂɂ͕ςȋ@�B��";
		mes "�@��������t���Ă�B";
		mes "�@�J�[�h���h�����ޏ�������-";
		next;
		mes "-�����v�����Ă���-";
		next;
		mes "-�ł��A�J�[�h���Ȃ��c�c-";
		close;
	case 3:
		if(RA_1QUE != 10) {
			mes "-�h�[��!!-";
			mes "-�v��������R���Ă݂����ǁA";
			mes "�@����ȓS�̔��͓����Ȃ�����-";
			close;
		}
		mes "-����˂��o���Ɠ�����";
		mes "�@�܂��Ă��������c�c-";
		break;
	case 4:
		mes "-���킪���邩";
		mes "�@�����J�����c�c";
		mes "�@�Ⴆ�J�����Ƃ��Ă�";
		mes "�@�M�k�����Ƀ{�R�{�R�Ɂc�c-";
		next;
		mes "-�~�߂������悳������-";
		close;
	}
	close2;
	set RA_1QUE,11;
	warp "ra_temple.gat",119,175;
	end;
}

hu_in01.gat,23,311,5	script	���|���l	898,{
	mes "[�p�[�e�B�O�b�Y���l]";
	mes "��������Ⴂ�܂��I";
	mes "���F�B�ƈꏏ��";
	mes "�ԉ΂ŗV��ł݂܂��񂩁H";
	mes "500Zeny�� 5�Z�b�g�ɂȂ�܂��B";
	next;
	if(select("����","����Ȃ�")==2) {
		mes "[�p�[�e�B�O�b�Y���l]";
		mes "�Â��Ő^�����ȋ�ɔ�΂�";
		mes "�ԉ΂͂Ƃ��Ă��Y��Ȃ̂Ɂc�c";
		close;
	}
	if((MaxWeight - Weight) < 2000) {
		mes "-�����A�C�e���̏d�ʂ���������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���-";
		mes "-�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă�������-";
		close;
	}
	if(Zeny < 500) {
		mes "[�p�[�e�B�O�b�Y���l]";
		mes "���q����A����������܂����H";
		close;
	}
	mes "[�p�[�e�B�O�b�Y���l]";
	mes "���肪�Ƃ��������܂��I";
	mes "�����Ɋy����ł��������ˁB";
	set Zeny,Zeny-500;
	getitem 12018,5;
	close;
}

//============================================================
// ����̔閧�N�G�X�g
//- Registry -------------------------------------------------
// RA_2QUE -> 0�`10
//------------------------------------------------------------
rachel.gat,142,167,5	script	�N����T���Ă�M�k	916,6,6,{
	if(RA_1QUE != 16 || RA_2QUE != 0 || RA_4QUE != 13) {
		mes "[�A���i�x���c�̐M�k]";
		mes "���_�t���C���l�̌���삪";
		mes "����񎖂��c�c";
		close;
	}
OnTouch:
	if(RA_1QUE != 16 || RA_2QUE != 0 || RA_4QUE != 13)
		end;
	mes "[�A���i�x���c�̐M�k]";
	mes "���́c�c�A����������";
	mes strcharinfo(0)+ "�l";
	mes "�ł́c�c�H";
	next;
	menu "�����ł�",-;
	mes "[�A���i�x���c�̐M�k]";
	mes "�W�F�h��_���l���A";
	mes strcharinfo(0)+ "�l��";
	mes "���T���ɂȂ��Ă���܂��B";
	next;
	menu "�ǂ����Ăł����H",-;
	mes "[�A���i�x���c�̐M�k]";
	mes "�����c�c";
	mes "���̂ł��傤�H";
	mes "���́A�`���𗊂܂ꂽ�����ł��̂ŁB";
	next;
	mes "[�A���i�x���c�̐M�k]";
	mes "��_���l�́A�_�a�̒��ɂ���";
	mes "�E����ڂ̕����ɂ�������Ⴂ�܂��B";
	close;
}

ra_temin.gat,277,159,3	script	�W�F�h��_��	932,{
	cutin "ra_gman",2;
	switch(RA_4QUE) {
	default:
		mes "[�W�F�h��_��]";
		mes "�������_�t���C���l�̏j����";
		mes "����񎖂��c�c";
		close2;
		cutin "ra_gman",255;
		end;
	case 12:
		mes "[�W�F�h��_��]";
		mes "�N�͒N���H";
		mes "�O�ɉ�����������������ȁc�c�H";
		next;
		mes "[�W�F�h��_��]";
		mes "�����́A�O���̐l�Ԃ��C���������Ă�";
		mes "�����Ȃ��ꏊ�Ȃ񂾁B";
		mes "�������A�o�Ă����ĖႢ�����c�c";
		next;
		menu "�r���Z���g����̈˗��Łc�c",-;
		mes "[�W�F�h��_��]";
		mes "��H";
		mes "�r���Z���g�́c�c�H";
		next;
		mes "[�W�F�h��_��]";
		mes "����!!�@�������I";
		mes "��̌����ȁI";
		mes "�����A��_���̃W�F�h���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�r���Z���g�ɗ��񂾂̂́A";
		mes "�����O�������񂾂��c�c";
		mes "�x�������ȁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�������c�c";
		mes "�O���̐l�Ԃɑ厖�ȕ�΂�";
		mes "�^�΂���Ƃ́c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�Ƃɂ����A��΂�n���Ă���B";
		next;
		mes "-�r���Z���g����a���������b�Z�[�W��";
		mes "�@��΂��W�F�h��_���ɓn����-";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "��H";
		mes "���̃��b�Z�[�W�́A��́c�c";
		next;
		mes "-�W�F�h��_���͏����������\��ŁA";
		mes "�@�r���Z���g����̃��b�Z�[�W��";
		mes "�@�ǂݎn�߂�-";
		next;
		mes "-���b�Z�[�W�̓��e�͂킩��Ȃ����A";
		mes "�@�ǂ�ł���W�F�h��_���̕\���";
		mes "�@�������Ȃ��Ă���-";
		next;
		mes "[�W�F�h��_��]";
		mes "�r���Z���g�ƃW�F�j�[�A";
		mes "�����āA�t�H�r�G�c�c";
		mes "�ނ�ɂ���Ȏ���������Ƃ́c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�r���Z���g���t�H�r�G�ɑ΂��A";
		mes "�������ڂ��Ă����̂́A�閧���I������";
		mes "���܂�ʂ悤�ɂƁc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "����ȁc�c";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�ق�ꂽ�Ƃ͂����A�댯���ڂ݂��A";
		mes "�ނ�ׂ̈ɗ͂�s�����Ă����";
		mes "���߂ė���������B";
		next;
		mes "[�W�F�h��_��]";
		mes "���̈˗����󂯂��̂́A���ׂ̈��H";
		next;
		menu "�D��S����ł�",-;
		mes "[�W�F�h��_��]";
		mes "�D��S���c�c";
		mes "�D��S�ŗ��ݎ�����";
		mes "���܂Ō�����Ƃ́c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�N�́A�`���҂̋C���������Ă���l���B";
		mes "�C�ɓ������I";
		next;
		mes "[�W�F�h��_��]";
		mes "�Ƃ���ŁA�N�̖��O�́H";
		next;
		menu "���O��������",-;
		mes "[�W�F�h��_��]";
		mes strcharinfo(0)+ "���c�c";
		mes "�������O���B�o���Ă������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N�ɂ���";
		mes "���_�t���C���l�̏j��������񎖂��c�c";
		close2;
		cutin "ra_gman",255;
		misceffect 253,"";
		set RA_4QUE,13;
		if(checkre())
			getexp 90000,0;
		else
			getexp 900000,0;
		end;
	case 13:
		if(RA_1QUE == 16)
			break;
		mes "[�W�F�h��_��]";
		mes "�厖�ȕ�΂�T���Ă���Ă��肪�Ƃ��B";
		mes "���_�t���C���l�̏j��������񎖂��c�c";
		close2;
		cutin "ra_gman",255;
		end;
	}
	switch(RA_2QUE) {
	case 0:
		mes "[�W�F�h��_��]";
		mes "�悭���Ă��ꂽ�B";
		mes "�{���́A������ɂ����ׂ��Ȃ񂾂�";
		mes "�Z�����Ăȁc�c";
		mes "�������ČĂ�Ŗ�����̂��B";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "���́A�N�ɗ��݂������Ăȁc�c";
		mes "�O���̐l�Ԃ̒��ŁA�M���ł���̂�";
		mes "�N�������Ȃ��āc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���ʂ́A���e�𕷂��Ă���";
		mes "�󂯂邩�f�邩���߂�̂��낤���A";
		mes "���̌��͏�������łȁc�c";
		mes "��������d��������ĖႤ�����Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�ǂ����H";
		mes "���݂𕷂��Ă���邩�H";
		next;
		if(select("�f��","�����Ă�����")==1) {
			mes "[�W�F�h��_��]";
			mes "�ނ��c�c�A�d���Ȃ��ȁB";
			mes "�����A�C���ς������܂����Ă���B";
			mes "�O���̐l�ԂŌN�̂悤�Ȑl���́A";
			mes "�Ȃ��Ȃ����Ȃ����̂łȁc�c";
			break;
		}
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�����I";
		mes "���������Ă����Ƃ́A���肪�����I";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "���ݎ���b���O�ɁA������x�������c�c";
		mes "���ꂩ��b�����e�́A�ɔ鎖���łȁB";
		mes "��΂ɑ������p�ŗ��ށI";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�m���Ă��邩������Ȃ����A";
		mes "�A���i�x���c�͏��_�t���C���l�Ɏd����";
		mes "�l�X��������������B";
		next;
		mes "[�W�F�h��_��]";
		mes "��ʐM�k������";
		mes "���̐M�k�������w������_���A";
		mes "�X�ɁA���̏�̑�_���B";
		mes "�����āc�c�A";
		mes "���_�t���C���l�Ɉ�ԋ߂����c�B";
		next;
		mes "[�W�F�h��_��]";
		mes "���c�́A���_�t���C���l�̂��킷�A";
		mes "���̃��w���𗣂���Ȃ��ׂɁA";
		mes "�O�̋ߋ����m�肽����l�q�Ȃ̂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���c�����ł͂Ȃ��A�_����M�k������";
		mes "�]�胉�w���̊O�ɏo�鎖���Ȃ��Ăȁc�c";
		mes "�O�̋ߋ���m���Ă���҂����Ȃ��̂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�u���c�͐_��I�ŁA�̑�ȑ��݂ł���v";
		mes "��ʐM�k�́A���c�������v���Ă���B";
		mes "���̊��҂𗠐؂��ɂ͂�����̂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���c���A����Ȑl�ԓI�ȍD��S��";
		mes "�����Ă��鎖��m�点���ɂ́c�c";
		mes "���c�̌��Ђ��n�ɗ����Ă��܂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "��_����c�Řb�����������ʁA";
		mes "�M�p�ł���O���̐l�Ԃɗ������Ƃ���";
		mes "�ӌ����o�ĂȁB";
		mes "�����ŁA�N���v���o�����̂��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "��΂ɑ������p�ƌ��������R��";
		mes "�������ĖႦ�����ȁH";
		next;
		mes "[�W�F�h��_��]";
		mes "���c�ɒ��ځA�q�y���鎖�ɂȂ邪�c�c";
		mes "���S��������K�v�͑S���Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���܂ŌN���o����������v������";
		mes "�����́A���c�Ƃ��ď\���������b���B";
		next;
		mes "[�W�F�h��_��]";
		mes "���ł������Ȃ��b���Ă���B";
		mes "���_�t���C���l�̈ӎu��`���鎖�ŁA";
		mes "���ԂƊu�₳�ꂽ���E�Ő����Ă���";
		mes "���c���y���܂��č����グ�鎖�A";
		mes "���ꂪ���̊肢���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���̂܂܋��c�̏��ɍs����Ƃ悢���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���������ɁA";
		mes "���̑�_���ɌN���M�p�o����҂���";
		mes "�ؖ����Ȃ��Ă͂Ȃ�Ȃ��Ăȁc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�����ŁA�p�ӂ��ĖႢ������������B";
		mes "��͑�_���������s�ł���^FF0000���E��^000000";
		mes "�����Ă������^FF0000�X�̐S��40��^000000���B";
		next;
		mes "[�W�F�h��_��]";
		mes "���E���́A���������Ă������B";
		mes "���Ƃ́A^FF0000�X�̐S��40��^000000��������";
		mes "�_�a�����̋��c�������܂ŗ��Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�������́A�_�a�����̗�q�������ɓ���";
		mes "���m����l�Ŏ���Ă���傪��������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����ɂ��镺�m�ɐ��E���ƕX�̐S����";
		mes "�n���΁A���c�������ɓ���邾�낤�B";
		next;
		mes "-���E��������-";
		next;
		mes "[�W�F�h��_��]";
		mes "����ł́A��낵�����ށB";
		set RA_2QUE,1;
		close2;
		cutin "ra_gman2",255;
		end;
	case 1:
	case 2:
		mes "[�W�F�h��_��]";
		mes "^FF0000�X�̐S��40��^000000��������";
		mes "�_�a�����ɂ��鋳�c�������ɗ��Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�������́A�_�a�����̗�q�������ɓ���";
		mes "���m����l�Ŏ���Ă���傪��������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����ɂ��镺�m�ɐ��E���ƕX�̐S����";
		mes "�n���΁A���c�������ɓ���邾�낤�B";
		close2;
		cutin "ra_gman",255;
		end;
	case 3:
		mes "[�W�F�h��_��]";
		mes "����ꂳ��B";
		mes "�v������葁�������ȁB";
		mes "���c�����ɖ��������l�q�Ŋ�������B";
		mes "�ŁA�ǂ�Șb�������񂾂��H";
		next;
		mes "-��_���ɋ��c��";
		mes "�@�b�������e��`����-";
		next;
		mes "[�W�F�h��_��]";
		mes "�������I";
		mes "��͂莄�̖ڂ͋����Ă��Ȃ������ȁB";
		mes "�N�̗l�Ȗ`���҂�����������ȁI";
		next;
		mes "[�W�F�h��_��]";
		mes "���ɂ͂ǂ�Șb�������񂾂��H";
		next;
		menu "����̘b������",-;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "����c�c!?";
		mes "�Ӂ[��c�c���悩�c�c";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�c�c";
		mes "����Ƃ́A�_�a���ɂ���";
		mes "���̖��̒ʂ�_���ȏꏊ�B";
		next;
		mes "[�W�F�h��_��]";
		mes "�_�a���ɊJ�����̊Ԃ������Ăȁc�c";
		mes "�_�������o���肷�鏊���Ƃ���A";
		mes "�N�������Ă͂Ȃ�Ȃ��Ƃ���Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�Ȃ����Ȃ����ɑ�_�����鎄��";
		mes "��O�ł͂Ȃ��Ăȁc�c";
		mes "���悪�ǂ�ȏꏊ�ŁA";
		mes "�����瑶�݂��邩�A";
		mes "�S���킩��Ȃ��񂾁c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ꉞ�A�����Ă������c�c";
		mes "�����A���̑�_������A";
		mes "�N�Ƌ��c�̉�b�ɂ��ĕ����ꂽ���A";
		mes "����̎��͘b���Ȃ��悤�ɂ��Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�킩�������H";
		mes "���R�͕����Ȃ��ł���c�c";
		next;
		mes "[???��_��]";
		mes "�W�F�h��_���A���邩�H";
		next;
		mes "[�W�F�h��_��]";
		mes "��c�c�H";
		next;
		mes "[�W�F�h��_��]";
		mes "���I";
		mes "����ȏ��܂ł����łɂȂ�Ƃ́c�c";
		mes "�@���������܂����H";
		next;
		mes "[???��_��]";
		mes "���O�Ɠ�l�����";
		mes "�b���������������Ăȁc�c";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�͂��I";
		mes "�c�c�킩��܂����B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N�A�\����Ȃ����������";
		mes "�Ȃ��O���Ă���Ȃ����B";
		next;
		mes "[�W�F�h��_��]";
		mes "�I���܂ŗׂ̕����ŋx��ł��Ă���B";
		mes "�������A�������������͖Y���Ȃ�I";
		close2;
		cutin "ra_gman",255;
		set RA_2QUE,4;
		warp "ra_temin.gat",297,156;
		end;
	case 4:
		mes "[�W�F�h��_��]";
		mes "�N�A�\����Ȃ���������ƐȂ�";
		mes "�O���Ă���Ȃ����B";
		mes "�I���܂ŗׂ̕����ŋx��ł��Ă���B";
		mes "�������A�������������͖Y���Ȃ�I";
		close2;
		cutin "ra_gman",255;
		warp "ra_temin.gat",297,156;
		end;
	case 5:
		mes "[�W�F�h��_��]";
		mes "�҂����Ĉ��������ˁB";
		mes "���X�ŏ������鎖�������Ăȁc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "����H";
		mes "��������������������悤���ȁB";
		next;
		menu "�x�P���g�̎��𕷂�",-;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�x�P���g�H";
		mes "���������āA";
		mes "�j���G����_���ɉ�����̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�N�ɉ�����Ƃ́A�b���Ă��Ȃ��̂�";
		mes "�@�����Ƀj���G����_���̖��O���o��";
		mes "�@�Ȃ�āc�c";
		mes "�@���̂��낤�c�c�H-";
		next;
		mes "[�W�F�h��_��]";
		mes "���[��c�c";
		mes "�ޏ��͉����c�c�A����Ȃ��������H";
		mes "���̑O�ɌN�ɐ��������Ȃ���΁c�c";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�x�P���g�́A���̖��O���B";
		mes "�t���l�[���́A�W�F�h�E�x�P���g�B";
		mes "���i�̓W�F�h�Œʂ��Ă��邪�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "������l�c�c";
		mes "�������̖��O�ŌĂ�ł��ꂽ�l�c�c";
		mes "���ꂪ�A�j���G����_���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c";
		mes "���x�́A�N��������Ԃ��ȁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�j���G���͉����A����Ȃ��������H";
		next;
		mes "-�����S�O���Ȃ���A";
		mes "�@�j���G���Ƙb�������e��";
		mes "�@�W�F�h�ɘb����-";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c����ς�c�c";
		mes "�ޏ��炵���ƌ������c�c";
		mes "���[��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ޏ��̎��́A�܂��̋@��ɘb�����B";
		mes "�����́A����܂łɂ��悤���B";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�҂āI�@�V�k�S�����c�c";
		mes "�_�a���ɂ���^FF0000����^000000�ɂ͐�΋ߕt���ȁI";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-���悩�c�c";
		mes "�@�s���Ȃƌ������";
		mes "�@�s�������Ȃ����Ⴄ�͉̂��̂��낤-";
		set RA_2QUE,6;
		close2;
		cutin "ra_gman2",255;
		end;
	default:
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�҂āI�@�V�k�S�����c�c";
		mes "�_�a���ɂ���^FF0000����^000000�ɂ͐�΋ߕt���ȁI";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-���悩�c�c";
		mes "�@�s���Ȃƌ������";
		mes "�@�s�������Ȃ����Ⴄ�͉̂��̂��낤-";
		close2;
		cutin "ra_gman2",255;
		end;
	case 9:
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�c�c�������c�c";
		mes "���ǁA�N�͓����Ă��܂����ȁB";
		next;
		menu "�����N�������𕷂�",-;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�ʂɑ債�����͂Ȃ���c�c";
		mes "�����A��_����c�̌���ŁA";
		mes "���ɒ����x�ɂ������Ƃ���";
		mes "�ʒm�������������B";
		next;
		mes "[�W�F�h��_��]";
		mes "����́A�N�̂�������Ȃ�����";
		mes "����ȂɋC�ɂ���K�v�͂Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���́A�O����ӌ������X����Ȃ�����";
		mes "��_�������ĂˁB";
		mes "����ڂ̓G�ɂ��Ă����񂾂�B";
		next;
		mes "[�W�F�h��_��]";
		mes "������A����̎�����";
		mes "�ނ�ɂ́A��D�̋@������̂��낤�B";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�ӂ��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���͂����A�S�ɂ͕��a���B";
		mes "�_�̏j��������A���i�x���c��";
		mes "�������̂����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "����́A�_�̈ӎu�c�c�H";
		mes "����Ƃ��c�c�A�l�Ԃ̗~�]���c�c";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�j���G�������܂�ӂ߂Ȃ��ł���B";
		mes "�ޏ��ɂ��������͂����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���ẮA���݂��s�������ɂ�";
		mes "�S��ʂ����킹�������������c�c";
		mes "�����A�ޏ���ς����̂��낤�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�Ƃɂ����A���̑�_���ɂ�";
		mes "���Ȃ������������낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "�K���ɂ��A�N�������ɗ��������́A";
		mes "�閧�������̂ŁA";
		mes "�N�̊��m���Ă���l�Ԃ͏��Ȃ��B";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "����ŁA�N������ڂɂ��A";
		mes "�ǂ�ȋ^�������Ă��邩�z���͂��B";
		mes "�������A���͘b��������Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����o�Ă΁A";
		mes "���R�Ƃ킩��������邾�낤�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���̎��܂ł́A����Ō�������";
		mes "�N�ɂ������Ă͂Ȃ�Ȃ��B";
		mes "�킩�������H";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "���́A���ꂩ�璷���x�ɂ����B";
		mes "�{���ɂ���ꂳ�܁B";
		close2;
		cutin "ra_gman",255;
		misceffect 253,"";
		set RA_2QUE,10;
		if(checkre())
			getexp 90000,60000;
		else
			getexp 900000,600000;
		end;
	case 10:
		if(VE_3QUE == 25)
			break;
		mes "[�W�F�h��_��]";
		mes "���́A���ꂩ�璷���x�ɂ����B";
		mes "�{���ɂ���ꂳ�܁B";
		close2;
		cutin "ra_gman",255;
		end;
	}
	if(NAME_1QUE == 11) {
		mes "[�W�F�h��_��]";
		mes "�v���Ԃ肾�ȁB";
		mes "���C�ɂ��Ă������H";
		mes "���͌��Ă̒ʂ肾�B";
		mes "�ŁA���̗p���ȁH";
		next;
		if(select("���ƂȂ��c�c","�x�C���X�̎����ɂ���")==1) {
			mes "[�W�F�h��_��]";
			mes "�ӂށA�N�͏����ɂȂ̂��H";
			mes "���傤�Ǘǂ������B";
			mes "�����牽���������Ƃ��Ă��������B";
			mes "�悩������ꏏ�ɂǂ����ˁH";
			close2;
			cutin "ra_gman",255;
			end;
		}
		mes "[�W�F�h��_��]";
		mes "�x�C���X�ŋN���������H";
		mes "���̎����ˁH";
		mes "���̂悤�Șb�͒m��Ȃ����c�c";
		next;
		mes "-�W�F�h��_���Ƀx�C���X�ɖ�����";
		mes "�@�����݂��������l���̎���";
		mes "�@��������-";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂށc�c�c�c";
		mes "�ǂ����Ŏ����悤�Șb��";
		mes "�������悤�ȋC�����邪�c�c";
		mes "�ӂށc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�������I";
		mes "���������΁A�j���G������";
		mes "�̕�������������B";
		mes "�܂��A���̎��͏΂��b���������c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�m���A�������l����߂܂������A";
		mes "���[���~�b�h�K�b�c�̍��ʐE�Ȃ���";
		mes "�Ή��ɍ����Ă���ƕ������񂾁B";
		next;
		mes "[�W�F�h��_��]";
		mes "���̌�A�ǂ��Ȃ������܂ł�";
		mes "�����Ă��Ȃ����c�c";
		mes "�j���G���ɕ����Ή����킩�邾�낤�B";
		set NAME_1QUE,12;
		close2;
		cutin "ra_gman",255;
		end;
	}
	switch(VE_4QUE) {
	case 0:
		mes "[�W�F�h��_��]";
		mes "����͂���́c�c";
		mes "���̐��ň�Ԕ������S��������";
		mes "�{�����e�B�A�l��";
		mes "���Ă����������悤���ˁB";
		next;
		emotion 54,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���炩��Ȃ��ł��������B";
		next;
		mes "[�W�F�h��_��]";
		mes "���₢��A���炩���ĂȂ����Ȃ��B";
		mes "���͖{���ɂ����v���Ă���̂��B";
		mes "�N�͏@���A���ƂȂ�����ꂸ�A";
		mes "�����ȍD�ӂ���A";
		mes "�l�X�������Ă���ł͂Ȃ����B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����炭�A���@���n���̏����";
		mes "�N�̗\��ȂɂȂ��Ă���͂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�A�n�n�n�c�c";
		mes "�W�F�h��_���l����k���c�c";
		mes "�������Ƃ�܂��ˁB";
		next;
		mes "-�W�F�h��_���͔��΂�-";
		next;
		mes "[�W�F�h��_��]";
		mes "�ŁA���x�͂ǂ�Ȗ���";
		mes "���˂�����ł���̂��H";
		mes "�N�̎����B";
		mes "�킴�킴����K�˂��Ƃ������́A";
		mes "�܂��D��S��";
		mes "�����Ɋ������܂ꂽ�̂��낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "��̍����ŗ����Ă����";
		mes "�����Ă͂������c�c";
		mes "�x�C���X�ŉ����������̂��H";
		next;
		menu "�g�[���ΎR�Ŕ������������ɂ���",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c�g�[���ΎR��";
		mes "�����������̂ɂ��āA";
		mes "�������������āc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂށc�c";
		mes "�g�[���ΎR�ŉ��𔭌������̂�";
		mes "��̓I�ɘb���Ă���Ȃ����H";
		next;
		mes "^3333FF-���Ȃ��̓W�F�h��_���ɁA";
		mes "�@�x�C���X�ɂ����q���̗��݂�";
		mes "�@�g�[���ΎR�ŕ߂܂��Ă���";
		mes "�@���̎q�����������A";
		mes "�@���̎��������������ɂ���";
		mes "�@�ڂ����b����-^000000";
		next;
		mes "^3333FF-�W�F�h��_���͂��Ȃ��̘b��";
		mes "�@�����I����ƁA�����������\���";
		mes "�@���Ȃ������߂�-^000000";
		next;
		mes "^3333FF-�c�c���΂炭���ق����������A";
		mes "�@�W�F�h��_���̌��͓�����-^000000";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c���̃A���i�x���c�̎�]�́A";
		mes "�t���C���l�̉��g�ł��鋳�c�l�ƁA";
		mes "�䓙�A��_���B�Ő��藧���Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "��_���B�͊F�A�t���C���l�ׂ̈Ȃ�";
		mes "����ɂ��܂Ȃ��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����́c�c";
		mes "�A���i�x���c�̓t���C���l��";
		mes "�J���Ă鍑�ł����瓖�R�ł��ˁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�����c�c�S�Ă̑�_���̍l������";
		mes "�����Ƃ����킯�ł͂Ȃ��B";
		mes "�_�l�ւ̐[���M�Ɋ�Â��A";
		mes "�����Ƃ��Ă̂��ǂ����W��";
		mes "�]�ސl�X������΁c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�t���C���l�ׂ̈Ȃ�A";
		mes "^FF0000�ǂ�ȍs�ׂł����C�ł��ҁB";
		mes "���̐��̑S�Ă�_�l�ɕ����鎖��";
		mes "�������M�̂�������ƐM���Ă�ҁB^000000";
		next;
		mes "[�W�F�h��_��]";
		mes "��҂́u�}�i�h�v�ƌĂ΂��B";
		mes "�g�[���ΎR�̌����c�c";
		mes "�c�c����A�N�ɉB���K�v�������ȁB";
		mes "�g�[���ΎR�ɂ����n��";
		mes "�ނ炪�Ǘ����Ă���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c��n�ƌ������́c�c";
		mes "���ƕ��킪�����ɂ���Ɓc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A���̒ʂ肾�B";
		mes "�A���i�x���c�ɏZ�ސl�X�́A";
		mes "�g�[���ΎR�̉���_�̉����ƐM���A";
		mes "����A�߂����ɋߕt�����͂Ȃ��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�����A�}�i�h�͒n���w�҂��ق��A";
		mes "�g�[���ΎR���������Ȃ������m�F���A";
		mes "���̐_���ȏꏊ�Ɋ�n��������̂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���̊�n�ɉ������邩���̖ڂ�";
		mes "�m�F�����킯�ł͂Ȃ����c�c";
		mes "���̂悤�ȏꏊ�ɂ킴�킴";
		mes "��n��������̂��B";
		mes "��̂̑z���͂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "���炭�c�c���E�����ׂւƓ���";
		mes "���C�����o����Ă���̂��낤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ȁc�c";
		mes "���́A���̂悤�ȕ����";
		mes "���K�v������̂ł����I";
		next;
		mes "[�W�F�h��_��]";
		mes "���܂��Ă��邾�낤�c�c";
		mes "�u���~���̐S���v�ׂ̈��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������΁c�c";
		mes "�����̐���̒��ɂ��A";
		mes "���~���̐S���̌��Ђ̗l�Ȃ��̂��A";
		mes "����܂����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�䓙�̓t���C���l��M���Ă���B";
		mes "���̃t���C���l�����̓y�n��I�сA";
		mes "�����ɉ䓙���Z�܂킹���̂��B";
		mes "�����āA�䓙��";
		mes "^3333FF�u���~���̐S�����K�v�ł��B�v^000000";
		mes "�Ƌ�ꂽ�ƌ���Ă���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�䓙�̓A���i�x���c�̋��X��";
		mes "�T���s�������c�c";
		mes "�������A�����ɂ͋͂��Ȍ��Ђ���";
		mes "�c����Ă��Ȃ������B";
		mes "���̌��Ђ����ł́A���~���̐S����";
		mes "���S�ɕ������鎖�͖����������B";
		next;
		mes "[�W�F�h��_��]";
		mes "���炭�A���~���̐S���̌��Ђ�";
		mes "�S�嗤�ɎU��΂��Ă���̂��낤�B";
		mes "�m���A�V���o���c�o���h���a����";
		mes "����z�R�ł����Ђ�����������";
		mes "�����Ă���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�����āA�}�i�h��";
		mes "���~���̐S���̌��Ђ�";
		mes "���[���~�b�h�K�b�c������";
		mes "��ʂɂ���ƐM���Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�V���o���c�o���h���a���̎�]��";
		mes "�A���i�x���c�����̋}�i�h�̎�]��";
		mes "�ٖ��Ȋ֌W�ł͂��邪�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���[���~�b�h�K�b�c������";
		mes "�A���i�x���c�����́c�c";
		mes "���j�I�ɓG�Ί֌W�ł��������ׂɁA";
		mes "���ł��c�c�֌W�͗ǂ��Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����ŁA�}�i�h��";
		mes "�͂Ń��[���~�b�h�K�b�c��������ɂ��A";
		mes "���~���̐S���̌��Ђ���ɂ��悤��";
		mes "���Ă���񂾁B";
		next;
		mes "[�W�F�h��_��]";
		mes "��牸���h�́A���͂��g�킸��";
		mes "���~���̐S������낤�Ǝ��݂Ă����B";
		mes "�[�����~���̐S�����ȁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�V���o���c�o���h���a����";
		mes "�Ȋw�҂̗͂܂Ŏ؂�Ċ����������c�c";
		mes "�̐S�ȉȊw�҂����������͂���";
		mes "�[�����~���̐S����j��A";
		mes "�s���s���ɂȂ����̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "^3333FF�u�[�����~���̐S���v�c�c";
		mes "�u�Ȋw�ҁv�c�c�u�s���s���v�c�c^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������āA�Ȋw�҂̖��́c�c";
		input '@word$;
		mes "^3333FF" +'@word$+ "^000000�ł����H";
		next;
		if('@word$ == "�o�������g") {
			mes "[�W�F�h��_��]";
			mes "�N���m���Ă���̂��H";
			mes "�����A�o�������g���B";
			mes "�ނ��[�����~���̐S����j�󂵁A";
			mes "�p���������̂��B";
		}
		else {
			mes "[�W�F�h��_��]";
			mes '@word$+ "�H";
			mes "���̒m���Ă���Ȋw�҂ł͂Ȃ��ȁB";
			mes "�[�����~���̐S���������";
			mes "�Ȋw�҂̖��́A";
			mes "^3333FF�o�������g^000000�ƌ����B";
		}
		next;
		mes "[�W�F�h��_��]";
		mes "�ނ�����������p����������A";
		mes "�V���o���c�o���h���a��������";
		mes "���炩�̏o�������������炵���B";
		mes "���Ԃ����É��������ɂ́A";
		mes "�����o�������g�̎肪���肷��";
		mes "�͂߂Ȃ���ԂɂȂ��Ă����炵���B";
		next;
		mes "[�W�F�h��_��]";
		mes "���ꂩ��A���̉Ȋw�ҒB��";
		mes "�[�����~���̐S��������������";
		mes "�炵�����c�c";
		mes "�ȑO�̕��Ƃ͈Ⴂ�A";
		mes "�ƂĂ��s����ȑ㕨�������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����̏o�����ɂ��A";
		mes "��牸���h�͗͂������A";
		mes "�}�i�h�͕��틟����";
		mes "�͂�����l�ɂȂ����̂��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�m���Ă̒ʂ�A";
		mes "���̃A���i�x���c������";
		mes "�Z�p�I�ɂ͔��W����Ă��Ȃ����ŁA";
		mes "������債�����̂��Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "������ɍ����Ă����牸���h�́A";
		mes "�����������Ă���}�i�h��";
		mes "�������Ⴄ����ɁA";
		mes "���퐻���̎x�������鎖�ɂ����̂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�ȒP�Ɍ����ƁA�����h�͐����";
		mes "�V���o���c�o���h���a����";
		mes "���~���̐S���̌����ƕ���J���B";
		mes "�}�i�h�͍X�Ȃ镐��̊m�ۂ�";
		mes "���Ă���Ƃ��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "^3333FF�i�[�����~���̐S����j�󂵁A";
		mes "�@����������p���������o�������g�B";
		mes "�@�ނ��������Ă��Ȃ�������A";
		mes "�@�����A�~�b�h�K���h�嗤��";
		mes "�@�푈�̉���";
		mes "�@��܂�Ă��������m��Ȃ��c�c�j^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�}�i�h���W�߂������";
		mes "�ǂꂭ�炢�ł��傤���H";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c���܂Ȃ��B";
		mes "���͋}�i�h�ł��Ȃ����A";
		mes "���͍��J���ꂽ�g�B";
		mes "���ׂ悤���Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A���킪����Ȃ��Ă��A";
		mes "���肵���[�����~���̐S����";
		mes "�������Ȃ��Ă��A";
		mes "�E�C�����Ă�}�i�h��";
		mes "���푈���d�|���Ă��܂��Ă�";
		mes "���������Ȃ����낤�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ȁI";
		mes "�푈���N����΁A";
		mes "���[���~�b�h�K�b�c������";
		mes "�l�X�����ł͂Ȃ��A";
		mes "�A���i�x���c�����̐l������";
		mes "�ꂵ�ގ��ɂȂ��ł���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�W�F�h��_���I";
		mes "���Ȃ��͂��ꂪ�킩���Ă��Ȃ�����A";
		mes "�������Ȃ��ƌ����̂ł����I";
		next;
		mes "[�W�F�h��_��]";
		mes "�����c�c���̎��́A";
		mes "�����̕��ʂ̐_���ɂ����Ȃ��c�c";
		next;
		mes "^3333FF-���ƁA��C�Ȏ��������Ȃ�����A";
		mes "�@�W�F�h��_���͂��Ȃ������Ȃ���";
		mes "�@�j���b�Ə΂���-^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ȁc�c���ł����H";
		mes "���̏΂��́c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�����A�����낤�ˁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�܂����I";
		mes "�푈���~�߂���@��";
		mes "�����ł���!?";
		next;
		mes "[�W�F�h��_��]";
		mes "����A����͂܂��킩��Ȃ��B";
		mes "�����c�c�N�̂��̕��a��]�ދ���";
		mes "�C����������΁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂӁc�c";
		mes "�܂��͊�n�ɐ������āA";
		mes "�N�̖ڂŌ�����m�F���Ă݂Ă�";
		mes "�ǂ����ȁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł��A�������R���{�݂Ȃ�A";
		mes "�x���͂������͂��ł����!?";
		mes "����ȏ��ɐ����Ȃ�āc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂށc�c������������B";
		mes "�����A������@�͕K������͂����B";
		mes "�����l���Ă݂悤�c�c";
		set VE_4QUE,1;
		close2;
		cutin "ra_gman",255;
		end;
	case 1:
	case 2:
	case 3:
	case 4:
		mes "[�W�F�h��_��]";
		mes "�ӂށc�c";
		next;
		switch(select("��n�ւ̐������@�ɂ���","�����h�ɂ���","�}�i�h�ɂ���")) {
		case 1:
			mes "[�W�F�h��_��]";
			mes "�܂����@�͎v�����Ȃ��B";
			mes "�F�X�l���Ă͂��邩��A";
			mes "���������҂��Ă���Ȃ����B";
			break;
		case 2:
			mes "[�W�F�h��_��]";
			mes "�푈�͔��΂��Ă��邪�A";
			mes "�t���C���l�ׂ̈�";
			mes "�[�����~���̐S�����������悤�ƁA";
			mes "�Ȋw�I�ȕ��@��͍���";
			mes "���������Ă���B";
			next;
			mes "[�W�F�h��_��]";
			mes "����J��������Ƃ����āA";
			mes "��������}�i�h�ɛZ�тȂ���ˁc�c";
			next;
			mes "[�W�F�h��_��]";
			mes "�����A�����ɏW�����邠�܂�A";
			mes "�����ꂴ��s�ׂɎ���o���҂�����B";
			mes "�߂��������c�c";
			break;
		case 3:
			mes "[�W�F�h��_��]";
			mes "�ނ�̃t���C���l�ւ̎v����";
			mes "���낵�����̂��B";
			mes "���͂����A�g�[���ΎR�ɂ���";
			mes "��n�̔����J���Ȃ������肤�΂���B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�g�[���ΎR�̊�n�͒N��";
			mes "�Ǘ����Ă���̂ł����H";
			next;
			mes "[�W�F�h��_��]";
			mes "�A���i�x���c����";
			mes "�S�Ă̌��z���Ǘ�����";
			mes "�r���h��_���̊Ǌ��̂͂����B";
			next;
			mes "[�W�F�h��_��]";
			mes "���̌����̂قڔ��Α��ɂ���";
			mes "�ނ̕��������Ă���Ƃ����B";
			mes "�x�����Ă��镺�����邮�炢���B";
			mes "�}�i�h�̒��ł��A�ނ̎����n�ʂ�";
			mes "�ǂ���̂��̂����킩�邾�낤�B";
			break;
		}
		close2;
		cutin "ra_gman",255;
		end;
	case 5:
		mes "[" +strcharinfo(0)+ "]";
		mes "��������Ă��������B";
		next;
		mes "-���Ȃ��̓W�F�h��_����";
		mes "�@���ނ�n����-";
		next;
		mes "[�W�F�h��_��]";
		mes "����͉����ˁH";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�I";
		next;
		mes "[�W�F�h��_��]";
		mes "���ꂾ!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��������܂�����!?";
		next;
		mes "[�W�F�h��_��]";
		mes "�����������I";
		mes "�N���m���Ă���ʂ�A";
		mes "���̊�n�͉ΎR�̒���";
		mes "����Ă���!!";
		next;
		mes "[�W�F�h��_��]";
		mes "�g�[���ΎR�͋x�ΎR�ł����āA";
		mes "���ΎR�ł͂Ȃ��B";
		mes "�Ȃ̂ɁA�ނ�͉���";
		mes "����Ȋ댯�ȉΎR�̒���";
		mes "�킴�킴��n��������̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ΎR�ł�����ɓ���Ȃ�";
		mes "����ȍz���ł�����̂ł́H";
		next;
		mes "[�W�F�h��_��]";
		mes "������ꗝ���邪�c�c";
		mes "����Ȃ�^������΂��������̘b���B";
		mes "�Ȃ̂ɁA��n��������Ƃ������Ƃ́A";
		mes "�g�[���ΎR�ɂ������Ȃ���΂Ȃ�Ȃ�";
		mes "���R������͂����B";
		next;
		mes "[�W�F�h��_��]";
		mes "���炭�A�g�[���ΎR�̔M�łȂ��ƁA";
		mes "�n���������o���Ȃ�����ȋ�����";
		mes "����̂��낤�B";
		mes "������A�^�����e�Ղł͂Ȃ������";
		mes "�g�[���ΎR�Ő������Ă���̂���";
		mes "���͍l���Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����āA���̎����ɂ��ƁA";
		mes "�u�g�[���ΎR�͋x�ΎR�����A";
		mes "�@�������ĊJ����܂ł�";
		mes "�@���S�N��Ɨ\�������B�v";
		mes "�Ə�����Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A�ߋ��A���񂩃g�[���ΎR��";
		mes "���΂���\�������ɍ����Ȃ���";
		mes "�Ƃ����L�^�������Ă���B";
		mes "���������Ԃɖ߂����悤�����ȁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@����Ȃɕp�ɂ�";
		mes "�ΎR�̏�Ԃ��ĕς����̂ł����H";
		next;
		mes "[�W�F�h��_��]";
		mes "�����܂ł͎��͒m��Ȃ����A";
		mes "���̒n���w�҂̕񍐏��ɂ��΁A";
		mes "�g�[���ΎR�͈��肵����Ԃ�";
		mes "��{�I�ɂ͈ێ����Ă��邪�A";
		mes "���܂ɔ����ȕω������m����邽�߁A";
		mes "�x����o���Ă��鎖������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����āA���T�Ԍ�ɂ�";
		mes "���΂̋��ꂪ�Ȃ��Ȃ����炵���B";
		mes "���̌x��̎�������";
		mes "�ߋ�3��L�^����Ă���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��c�c";
		mes "�Ƃ񂾏��Ɋ�n������������ŁA";
		mes "�F�X�Ƌ�J���Ă܂��ˁc�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂӁc�c";
		mes "�܂��A���Ƃ��ẮA";
		mes "�ނ炪��J����΂����";
		mes "��΂����������ȁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�������c�c";
		mes "�ǂ������̕񍐏��ɂ�";
		mes "������a����������c�c";
		mes "����͎��̊������A";
		mes "���̒n���w�҂�";
		mes "���������ł���l�ȋC������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��݁c�c�ł����H";
		next;
		mes "[�W�F�h��_��]";
		mes "�������c�c�����������";
		mes "���̒n���w�҂͎������ɋ��͂��A";
		mes "��n�ւ̐N���o�H��";
		mes "�����Ă���邩�������ȁB";
		mes "�ǂ����H";
		mes "��x���̒n���w�҂�K�˂Ă݂ẮH";
		next;
		if(select("�����ł���","����́c�c�����ł�")==2) {
			mes "[�W�F�h��_��]";
			mes "����H";
			mes "���a��]�ތN�̋C������";
			mes "�����ς���Ă��܂����̂��H";
			next;
			mes "[�W�F�h��_��]";
			mes "�܂��A�ꉞ�ނ̋��ꏊ�͋����悤�B";
			mes "���A�肪����ɂȂ肻���Ȃ̂�";
			mes "���̒n���w�҂��炢���Ƃ�������";
			mes "�o���Ă��ė~�����B";
			mes "�C���ς������s���Ă݂Ȃ����B";
			next;
		}
		mes "[�W�F�h��_��]";
		mes "�񍐏��ɂ��ƁA�n���w�҂�";
		mes "���w���̓�A�x�C���X�ɂ���炵���B";
		mes "�N���s���Ă����̂��낤�H";
		mes "�ł́A�ǂ��m�点��҂��Ă�B";
		delitem 7342,1;
		set VE_4QUE,6;
		close2;
		cutin "ra_gman",255;
		end;
	default:
		mes "[�W�F�h��_��]";
		mes "�񍐏��ɂ��ƁA�n���w�҂�";
		mes "���w���̓�A�x�C���X�ɂ���炵���B";
		mes "�N���s���Ă����̂��낤�H";
		mes "�ł́A�ǂ��m�点��҂��Ă�B";
		close2;
		cutin "ra_gman",255;
		end;
	case 26:
		mes "[�W�F�h��_��]";
		mes "�������I";
		mes "�҂���тĂ������I";
		mes "�ŁA�ǂ��������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ӂӁc�c";
		mes "�����A�ނ�͍����A";
		mes "���z���̏����ő�Z���ł���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�ǂ����������ˁH";
		next;
		mes "-���Ȃ��́A�񍐏��ŌR�����x���A";
		mes "�@��n�̈ړ]����������������b����-";
		next;
		mes "[�W�F�h��_��]";
		mes "�n�n�n�I";
		mes "����͂��΂炵���I";
		mes "�悭����Ă��ꂽ�I";
		mes "�^�����킩��܂ł́A";
		mes "���z���ő�Z�����낤�ȁI";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A�ނ�����S��";
		mes "�ق点��D�@���I";
		mes "�ǂ����������Ă���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N�����Ă��Ă���B";
		mes "�䓙�̗͂Ő푈���~�߂Č�����B";
		mes "���ꂪ�����o������ɂȂ�����A";
		mes "�������N�̗͂�݂��Ăق����B";
		next;
		mes "[�W�F�h��_��]";
		mes "���̓��܂ŁA";
		mes "�䓙���������Ă���B";
		mes "�{���ɂ���J�l�������B";
		set VE_4QUE,27;
		if(checkre())
			getexp 20000,0;
		else
			getexp 200000,0;
		close2;
		cutin "ra_gman",255;
		end;
	case 27:
		break;
	}
	switch(NAME_2QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		mes "[�W�F�h��_��]";
		mes "�����A�N�̗͂�";
		mes "�؂��������邾�낤�B";
		mes "���̓��܂ŁA���傫�ȗ͂�";
		mes "���̎�ɏh���ė~�����B";
		close2;
		cutin "ra_gman",255;
		end;
	case 8:
		mes "[�W�F�h��_��]";
		mes "�ǂ����Ă��ꂽ�I";
		mes "�����ƘA�����s�����悤���ˁB";
		mes "�ǂ������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�h�������l�ɖ���";
		mes "����܂������ǂˁc�c";
		mes "���͂Ƃ�����A���v���Ԃ�ł��B";
		mes "�����Ă񂾂Ƃ������́c�c";
		mes "���Ɂu�������������v";
		mes "�Ƃ������ł��傤���c�c�H";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�������B";
		mes "���̓t���C���l��M����";
		mes "��l�̐M�k�ł��邪�A";
		mes "��������̐M�k�B�𗦂���";
		mes "��l�̑�_���ł�����B";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c���͍��J����";
		mes "�͂������Ă͂��邪�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����Ȏ�C�łǂ������ł����I";
		mes "���Ȃ��͍��傫�ȁu���v��";
		mes "�v�悵�Ă����ł��傤�H";
		mes "�Ȃ�A���X�Ƃ��Ȃ��ƁI";
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�ӂӁA�������ȁB";
		mes "�N�̌����ʂ肾�B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N���m���Ă̒ʂ�A";
		mes "�A���i�x���c�̓t���C���l��";
		mes "���ꎋ�������́A";
		mes "���h�ƌh���̑Ώۂł��鋳�c�l�ƁA";
		mes "�䓙��_������ՂƂȂ��Ă��鍑���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�����c�l�̑���ɁA";
		mes "��_���B����������������";
		mes "�x���Ȃ��Ƃ����Ȃ��񂾂��c�c";
		mes "�����͂������܂������Ă��Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�܂�ŁA�A���̂悤��";
		mes "����󔖂ȋ��c�l���Ƃ��Ă��A";
		mes "����͐_�a���̘b���c�c";
		mes "���̍��̍����ɂ́A���c�l������";
		mes "��ΓI�ȑ��݂ł���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		mes "�܂����A���Ȃ��́c�c!?";
		next;
		mes "[�W�F�h��_��]";
		mes "�������c�c";
		mes "�����h�����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̑�_���B��|���A";
		mes "���c�̍���D����";
		mes "���̍����䂪��ɂ��悤�Ȃ�āc�c";
		mes "����Ȗ�]�������Ă���Ȃ�āI";
		mes "�K�b�J���ł��I�@�W�F�h��_��!!";
		emotion 23,"";
		next;
		cutin "ra_gman2",2;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�������Ⴂ���Ă���悤���ˁB";
		mes "���͂���Ȗ�]�A�����Ă��Ȃ���B";
		emotion 4;
		next;
		cutin "ra_gman",2;
		mes "[�W�F�h��_��]";
		mes "�����������̂́A";
		mes "���c�l�̗͂�";
		mes "�����ɂ������Ƃ��������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N���g�[���ΎR�̕�⋊�n��";
		mes "���􂵂Ă��ꂽ���A";
		mes "�����A���̏�Ԃ�";
		mes "�����͑����Ȃ����낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "���܂ł̌������ʂ�";
		mes "���͂̂��߂Ɏg���A";
		mes "�Ō�̐킢�ɂ����꒧�ށc�c";
		mes "���ꂾ���́A���Ƃ��Ă�";
		mes "�����Ȃ���΂Ȃ�Ȃ��I";
		next;
		mes "[�W�F�h��_��]";
		mes "���̂��߂ɂ�";
		mes "���c�l������ΓI�Ȍ��͂�";
		mes "�䓙�̖����ɂ��Ȃ���΂Ȃ�Ȃ��I";
		mes "�c�c�N�͂ǂ��v���H";
		next;
		if(select("�^���ł��I","����́c�c�ǂ��Ȃ��Ǝv���܂�")==2) {
			mes "[�W�F�h��_��]";
			mes "���ɂ͑��̕��@�͎v�����Ȃ��B";
			mes "�������A���̗B��̒��Ԃł���";
			mes "�N�����΂���Ȃ�c�c�d���Ȃ��B";
			mes "����ɁA�N�̍l���𕷂����Ă���B";
			mes "���ɗǂ���i���H";
			next;
			input '@str$;
			mes "[" +strcharinfo(0)+ "]";
			mes '@str$;
			mes "�Ƃ����̂͂ǂ��ł����H";
			next;
			mes "[�W�F�h��_��]";
			mes "�ӂށc�c";
			mes "�c�c�c�c";
			mes "����c�c��͂苳�c�l��";
			mes "�͂����؂肵�������������낤�B";
			next;
		}
		mes "[�W�F�h��_��]";
		mes "���c�l�𖡕��ɂ���B";
		mes "�����͈Ղ��Ƃ͂悭���������̂��c�c";
		mes "���c�l�̓t���C���l�̉��g����";
		mes "�����Ă��邪�A���ۂɂ�";
		mes "�����̏����ɉ߂��Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�܂��A����m���";
		mes "�c�����c�l�𖡕��ɂ���ɂ́A";
		mes "�ǂ�����Ηǂ����ȁH";
		next;
		mes "[�W�F�h��_��]";
		mes "�c���Ƃ͌����Ă����c�l�B";
		mes "�{���̎���ł������A";
		mes "���ɐ���Ă���鎖��";
		mes "�肤�ׂ����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "����Ƃ��c�c";
		mes "�R���S����ׁA";
		mes "���c�l�𗘗p����`�Ƃ��邩�c�c";
		next;
		if(select("�{���̎�������","�R������")==1) {
			mes "[�W�F�h��_��]";
			mes "�c�c�������ȁB";
			mes "�c���Ƃ͂����A";
			mes "�ꍑ�̉^����w���������݁B";
			mes "����ȕ��𗘗p����Ȃ�āA";
			mes "������Ȃ������c�c";
			next;
			mes "[�W�F�h��_��]";
			mes "���܂Ō����Ȃ������ł�";
			mes "���c�l�͎󂯓���鎖��";
			mes "�o����̂��S�z�����c�c";
			mes "���c�l�ɏ��_�t���C���l�̏j����";
			mes "����񎖂��c�c";
			next;
		}
		else {
			mes "[�W�F�h��_��]";
			mes "�c�c�������ȁB";
			mes "���c�l�ɐ��̈ł�m�点��̂́c�c";
			mes "���܂�ɂ��ߍ��Șb���B";
			mes "���̏����ȐS�����Ă��܂�Ȃ����A";
			mes "�|���ĂȂ�Ȃ��c�c";
			next;
			mes "[�W�F�h��_��]";
			mes "���̃G�S�����m��Ȃ����A";
			mes "���c�l������Ȃ��悤�A";
			mes "���͓w�͂�����肾�B";
			mes "����́c�c�P�ӂ̋U��c�c";
			mes "�����M�������c�c";
			next;
		}
		mes "[�W�F�h��_��]";
		mes "���߂��ȏ�A���͍s�����鎞�B";
		mes "�������A��l�����ł�";
		mes "�S�ׂ��̂������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����͂܂�c�c";
		mes "�����u�������Ă���l��";
		mes "�W�߂�Ƃ������Ƃł����H";
		next;
		mes "[�W�F�h��_��]";
		mes "�������B";
		mes "���傤�ǁA���ɂ͂��̐S�����肪";
		mes "��l����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�{���ł����I";
		mes "����͒N�ł����H";
		emotion 52,"";
		next;
		mes "[�W�F�h��_��]";
		mes "���̐e�F�������c�c";
		mes "�j���G����_�����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�������c�c�ޏ��Ƃ͐́A";
		mes "�ӌ��̈Ⴂ�Ō݂��ɔw��";
		mes "������������������B";
		mes "���͂��Ă���邩�ǂ����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "-���ނ��Ă�";
		mes "�@�W�F�h��_���̎p���A";
		mes "�@���̂��₵�����Ɍ�����-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��܂��I";
		mes "���C���o���Ă��������I";
		mes "�������������܂�����H";
		mes "���X�Ƃ��Ă��Ȃ��ƁI";
		emotion 21,"";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�ӂӁB";
		mes "�������ȁc�c";
		mes "�����s�����悬�����������B";
		mes "�����A���͒��߂Ȃ��I";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A���̋C�����Ƃ�";
		mes "�֌W�Ȃ��A�j���G����";
		mes "���͂��Ă���邩�ǂ����́c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�ޏ��͈ꎞ�A";
		mes "���Ɠ��������h���������c�c";
		mes "�}�ɕς���Ă��܂����B";
		mes "���������������̂��낤���c�c";
		next;
		mes "[�W�F�h��_��]";
		mes strcharinfo(0)+ "��c�c";
		mes "�ޏ��ɉ���Ă���Ȃ����H";
		mes "�������̌v��͌��킸�A";
		mes "�ޏ��̈ӎv���m�F���ė~�����B";
		next;
		mes "[�W�F�h��_��]";
		mes "�����A�ޏ����������̌v���";
		mes "�����Ă��ꂻ���Ȃ�c�c";
		mes "���̎��́A�S�Ă�";
		mes "�ޏ��Ɍ����Ă��ǂ����낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "�ޏ��̎������́A";
		mes "�_�a�̍\����A���傤��";
		mes "���̕����̔��Α����B";
		mes "�Z�����g�Ȃ̂�";
		mes "�������ɂ��邩�͂킩��Ȃ����c�c";
		set NAME_2QUE,9;
		close2;
		cutin "ra_gman",255;
		end;
	case 9:
	case 10:
		mes "[�W�F�h��_��]";
		mes "�j���G���̎������ɍs���A";
		mes "�ޏ��̈ӎv���m�F���ė~�����B";
		mes "�䓙�̒��ԂɂȂ��Ă��ꂻ�����A";
		mes "�N�Ȃ�T�鎖���ł��邾�낤�B";
		close2;
		cutin "ra_gman",255;
		end;
	case 11:
		mes "[�W�F�h��_��]";
		mes "�ޏ��̕Ԏ��͂ǂ��������H";
		mes "���΂ɂ����Ȃ苦�͂��Ă����Ƃ�";
		mes "�v���Ă͂��Ȃ����c�c";
		next;
		mes "-�j���G����_�����畷�����A";
		mes "�@�����h�ɑ΂��鎸�]�ƁA";
		mes "�@�푈�ւ̊��҂�";
		mes "�@�W�F�h��_���ɓ`�����B";
		mes "�@�b�𕷂��Ă���W�F�h��_���̊�́A";
		mes "�@�ǂ�ǂ�Â��Ȃ��Ă�����-";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���������΁A�j���G�������҂���āA";
		mes "���̑�_���Ƌ���";
		mes "�V���o���c�o���h���a����";
		mes "�s������������B";
		mes "���̎�����A�j���G���͋F����~�߁A";
		mes "���܂获�����ɂ͂��Ȃ��悤�ɂȂ����B";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A�푈�����҂��Ă���ޏ���";
		mes "�^���͂ł��Ȃ��B";
		mes "�ޏ��͏d�v�Ȏ���Y��Ă���I";
		mes "^0000FF�푈�͑S�Ă𐮗�����̂ł͂Ȃ��A";
		mes "�S�Ă�j�󂷂�s�ׂȂ̂��I^000000";
		next;
		mes "[�W�F�h��_��]";
		mes "�j���G���ɑ���莆�����������B";
		mes "�����҂��Ă��Ă���B";
		set NAME_2QUE,12;
		close2;
		cutin "ra_gman",255;
		end;
	case 12:
		mes "[�W�F�h��_��]";
		mes "�����A�����n���Ă���B";
		mes "�ޏ������Ă��Ȃ��A";
		mes "�l�X�Ȏ��������Ȃ���΂Ȃ�Ȃ��I";
		next;
		mes "-�W�F�h��_������莆���󂯎����-";
		set NAME_2QUE,13;
		close2;
		cutin "ra_gman",255;
		end;
	case 13:
	case 14:
		mes "[�W�F�h��_��]";
		mes "�j���G���Ɏ莆��n���Ă���B";
		close2;
		cutin "ra_gman",255;
		end;
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
		mes "[�W�F�h��_��]";
		mes "�j���G�����狦�͂����";
		mes "�A���������I";
		mes "�{���ɗǂ������c�c";
		mes "�N�ɂ͔ޏ�����`���Ă��炢�����B";
		mes "���ށI";
		close2;
		cutin "ra_gman",255;
		end;
	case 20:
		mes "[�W�F�h��_��]";
		mes "�₟�A�҂��Ă�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�W�F�h��_���A�����������܂����B";
		mes "���U�@�ł͂���܂��񂪁A";
		mes "�j���G����_�������c�̐��b�W��";
		mes "�x�ɂ��o���Ă���܂����B";
		mes "����ŋ��c�Ƙb�����邱�Ƃ��ł��܂��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�ӂ��c�c�c�����c�l���A";
		mes "��X���A���̍��𗝉����ĉ����邩�c�c";
		mes "���ꂾ�����S�z���c�c";
		mes "���c�l�ɏ��_�t���C���l�̏j����";
		mes "����񎖂��c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�悵�I";
		mes "���͊o�傪�o�����B";
		mes "���ɋ��c�l�̏��֍s�����B";
		set NAME_2QUE,21;
		close2;
		cutin "ra_gman",255;
		end;
	case 21:
		mes "[�W�F�h��_��]";
		mes "���͊o�傪�o�����B";
		mes "���ɋ��c�l�̏��֍s�����B";
		close2;
		cutin "ra_gman",255;
		end;
	case 22:
		mes "[�W�F�h��_��]";
		mes "�j���G�����N�ɘb������炵���B";
		mes "�ޏ��ɘb�𕷂��Ă���A";
		mes "���̏��ɗ��Ă���Ȃ����H";
		close2;
		cutin "ra_gman",255;
		end;
	case 23:
		mes "[�W�F�h��_��]";
		mes "����Ȃɂ��܂��������̂�";
		mes "�t���C���l�A�����ČN�̂��A���B";
		next;
		mes "[�W�F�h��_��]";
		mes "�b�ɂ��ƁA�V���o���c�o���h��";
		mes "�A���i�x���c�̎x�����痣��A";
		mes "�Ǝ��̘H����������Ƃ��Ă���炵���B";
		mes "�A���i�x���c�ׂ̈̌���������";
		mes "�k�������Ǝv���̂����c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "�g�[���ΎR�̊�n��";
		mes "��������̂��Ă���炵���B";
		mes "���炭�A�߁X�����鎖�ɂȂ邾�낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "���c�l�̉������I��c�c";
		mes "���̑�_���B�̓{��́A";
		mes "�����猩�Ă��Ă�";
		mes "���낵�����̂������c�c";
		next;
		mes "[�W�F�h��_��]";
		mes "���́A���c�l�����̊����";
		mes "�ۂ܂�Ȃ����ƐS�z���������A";
		mes "���c�l�͑�_���B�̓{��ɕ������A";
		mes "���̏���������ċ��c�Ƃ��Ă̈Ќ���";
		mes "�����Ă����������񂾁B";
		next;
		mes "[�W�F�h��_��]";
		mes "���̑�_�����A���ǂ͐M�k�̈�l�B";
		mes "�t���C���l�̉��g�ł��鋳�c�l";
		mes "�̌��������Ō�܂�";
		mes "���ۂ������鎖�͖����������B";
		mes "������ɂ͏؋��Ƃ��������";
		mes "����������ȁB";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A������Ƃ�����";
		mes "�A���i�x���c���t���C���l�̕�����";
		mes "���߂��킯�ł͂Ȃ��B";
		mes "�����A���͂ł͂Ȃ��O����";
		mes "���~���̐S�������߂������B";
		next;
		mes "[�W�F�h��_��]";
		mes "�ȒP�Ȏ��ł͂Ȃ����낤�c�c";
		mes "�������A�������ŋF���Ă邾���ł�";
		mes "�����n�܂�Ȃ��B";
		next;
		mes "[�W�F�h��_��]";
		mes "�N�ɂ͉���������Ă�������B";
		mes "���x�����A���̃A���i�x���c��";
		mes "�{���ɕ��a�ɂ��Ă݂���I";
		next;
		mes "[�W�F�h��_��]";
		mes "�������A�����̂ŁA";
		mes "���ꂩ��Z�����Ȃ邾�낤�B";
		mes "���c�l�̌��ɐς܂ꂽ�ׂ�";
		mes "�o���邾������������悤�A";
		mes "�s�����Ă������肾�B";
		next;
		mes "[�W�F�h��_��]";
		mes "�c�c�N�͂܂����ɏo��̂��H";
		mes "���c�l�Ɉ��A����Ɨǂ����낤���A";
		mes "���̉�����A�[������ɂ��Ă���B";
		mes "�܂��A�܂��@����邾�낤�B";
		next;
		mes "[�W�F�h��_��]";
		mes "���c�l�̑���ɁA";
		mes "�����āA�A���i�x���c�̍�����";
		mes "��\���āA�N�Ɋ��ӂ̈ӂ�\�����I";
		mes "�^�̃��@���n���̗E�҂�I";
		set NAME_2QUE,24;
		if(checkre())
			getexp 150000,0;
		else
			getexp 1500000,0;
		close2;
		cutin "ra_gman",255;
		end;
	case 24:
		mes "[�W�F�h��_��]";
		mes "�N�̍s�����";
		mes "�t���C���l�̂����삪";
		mes "���ɂ��鎖���F��B";
		close2;
		cutin "ra_gman",255;
		end;
	}
}

ra_temin.gat,134,128,3	script	���c���������#ra	916,{
	switch(RA_2QUE) {
	case 0:
	case 1:
		mes "[���c���������]";
		mes "�O���̐l�Ԃ́A��_���l��^FF0000���E��^000000��";
		mes "^FF0000�X�̐S��40��^000000�������Ă��Ȃ���";
		mes "�������ɓ��鎖���ł��܂���B";
		if(RA_2QUE == 0 || countitem(7561) < 40)
			close;
		next;
		mes "[���c���������]";
		mes "���I�@���E���ƕX�̐S��40��";
		mes "�����Ă�������Ⴂ�܂����ˁB";
		mes "���ꂩ��A" +strcharinfo(0)+ "�l��";
		mes "���������������܂��B";
		close2;
		set RA_2QUE,2;
		delitem 7561,40;
		end;
	case 2:
		mes "[���c���������]";
		mes "���̔��̌������ɁA";
		mes "���c�l����������Ⴂ�܂��B";
		mes "���Ȃ炨��ɂȂ�ł��傤�B";
		close;
	default:
		if(NAME_2QUE == 15 || NAME_2QUE == 21) {
			mes "[���c���������]";
			mes "�j���G���l���畷���Ă���܂��B";
			mes "���̌������ɋ��c�l��";
			mes "��������Ⴂ�܂��B";
			mes "�^�������ɐi��ŁA�y�����Ă��������B";
			close;
		}
		mes "[���c���������]";
		mes "���c�l�͌��݁A��q���ł��B";
		mes "�N�ł��낤�Ɖy���͂ł��܂���B";
		close;
	}

}
ra_temin.gat,134,134,3	duplicate(���c���������#ra)	���c���������	916

ra_temin.gat,134,131,0	script	rasky_warp	45,1,1,{
	switch(RA_2QUE) {
	case 0:
	case 1:
		mes "-�����܂��Ă��ē���Ȃ�-";
		close;
	case 2:
		warp "ra_temin.gat",276,239;
		end;
	default:
		if(NAME_2QUE == 15 || NAME_2QUE == 21) {
			warp "ra_temin.gat",276,239;
			end;
		}
		mes "[���c���������]";
		mes "���c�l�͌��݁A��q���ł��B";
		mes "�N�ł��낤�Ɖy���͂ł��܂���B";
		close;
	}
}

ra_temin.gat,275,226,0	script	ra_sky	45,1,1,{
	if(NAME_2QUE == 21) warp "que_temsky.gat",99,11;
	else warp "ra_temsky.gat",99,11;
	end;
}

ra_temsky.gat,98,59,6	script	�j�M�k#rasky	926,{
	mes "[" +strnpcinfo(1)+ "]";
	mes "�������_�t���C���l��";
	mes "����삪����񎖂��c�c";
	close;
}
ra_temsky.gat,101,59,4	duplicate(�j�M�k#rasky)	���M�k	916
ra_temsky.gat,95,99,6	duplicate(�j�M�k#rasky)	�j�̐_��	935
ra_temsky.gat,93,97,6	duplicate(�j�M�k#rasky)	�j�M�k	927
ra_temsky.gat,91,95,6	duplicate(�j�M�k#rasky)	�j�M�k	926
ra_temsky.gat,104,99,4	duplicate(�j�M�k#rasky)	���̐_��	920
ra_temsky.gat,106,97,4	duplicate(�j�M�k#rasky)	���M�k	917
ra_temsky.gat,108,95,4	duplicate(�j�M�k#rasky)	���M�k	916

ra_temsky.gat,99,100,5	script	���c	936,{
	cutin "ra_bishop",2;
	if(RA_2QUE == 2) {
		mes "-���c�Ƃ����̂́A���������Ă���";
		mes "�@�l�̂悳�����Ȋ�������ꂳ�񂾂�";
		mes "�@�z�����Ă������c�c";
		mes "�@�����ł͂Ȃ�����-";
		next;
		mes "-�A���i�x���c�̋��c�́A";
		mes "�@������悤�ȓ����Ȕ������ƁA";
		mes "�@�^���Ȍ��̎��𐂂炵���l�Ȕ��A";
		mes "�@�����̐F���Ⴄ�I�b�h�A�C��";
		mes "�@�c������������-";
		next;
		mes "[���c]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "[���c]";
		mes "�c�c�ς��c�c�H";
		next;
		mes "-�ޏ��̓��˂Ȏ����";
		mes "�@���΂炭���h�������A";
		mes "�@�ޏ��Ɍ���Ȃ��悤�Ԏ�������-";
		next;
		menu "���̎��ł��傤���H",-;
		mes "[���c]";
		mes "�c�c";
		mes "�c�c�c�c";
		mes "�c�c���̎p�c�c";
		next;
		mes "[���c]";
		mes "���߂Ď��������l�́c�c";
		mes "�F�A����Ȗڂ��c�c���邩��c�c";
		next;
		mes "[���c]";
		mes "�����c�c����Ă邩��c�c";
		mes "�c�c�c�c";
		mes "�c�c���v�c�c";
		next;
		mes "-���v���ƌ����Ă��邪�A";
		mes "�@�ޏ��̓��͂ǂ����₵����������-";
		next;
		mes "[���c]";
		mes "�ǂ�����c�c";
		mes "�c�c�c�c�������H";
		next;
		input '@str$;
		mes "[���c]";
		mes '@str$+ "�H";
		mes "�c�c���߂āc�c�������B";
		mes "�c�c" +'@str$+ "�c�c";
		next;
		mes "[���c]";
		mes "�����Łc�c�����c�c";
		mes "�c�c���Ă����̂��c�c�H";
		next;
		input '@str$;
		mes "[���c]";
		mes '@str$+ "�H";
		mes "�Ӂ[��c�c";
		mes "�ςȎ����c�c���Ă��ȁB";
		next;
		mes "[���c]";
		mes "�c�c";
		mes "�ǂ�����āc�c";
		mes "�����܂Łc�c�����c�c�̂��H";
		next;
		mes "-�����₭�l�ȏ���������";
		mes "�@������莿������鋳�c�̎p�́A";
		mes "�@�ꍑ�����߂鋳�c�Ƃ�������";
		mes "�@���Ԃ�m��Ȃ������ɉ߂��Ȃ�����-";
		next;
		mes "-�l�X�Ȏ���ƕԎ������킳��Ă���";
		mes "�@�ǂ�ʂ̎��Ԃ��߂������낤�c�c";
		mes "�@�ӂƁA�������ꂢ���ꌾ��";
		mes "�@�������N����-";
		next;
		mes "[���c]";
		mes "���c�ł��c�c";
		mes "�c�c����Ȃ������c�c";
		mes "�c�c����񂾁c�c";
		next;
		mes "-���̍��̍ō����͎҂ł��鋳�c��";
		mes "�@����Ȃ����H-";
		next;
		menu "���̏ꏊ��q�˂�",-;
		mes "[���c]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "[���c]";
		mes "�c�c";
		mes "�c�c����c�c";
		next;
		menu "����Ƃ͉�������",-;
		mes "[���c]";
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "-����Ƃ͉����A�ƕ��������A";
		mes "�@�Ԏ��͂Ȃ�����-";
		next;
		mes "[�_��]";
		mes "���c�l�B";
		mes "��`�̌䎞�Ԃł������܂��B";
		next;
		mes "[�_��]";
		mes "���ꂩ��A";
		mes strcharinfo(0)+ "�l�B";
		mes "�W�F�h��_�����A���Ăтł��B";
		next;
		mes "[���c]";
		mes "�c�c";
		mes "�ʔ����c�c�b�c�c";
		mes "�c�c���肪�Ƃ��c�c";
		next;
		mes "[���c]";
		mes "��`�c�c";
		mes "�s���Ȃ���΂Ȃ�Ȃ��c�c";
		mes "�c�c���悤�Ȃ�c�c";
		set RA_2QUE,3;
		close2;
		cutin "ra_bishop",255;
		end;
	}
	if(NAME_2QUE < 15) {
		mes "[���c]";
		mes "�W�F�h�c�c��_���Ɂc�c";
		mes "�c�c�����āc�c";
		close2;
		cutin "ra_bishop",255;
		end;
	}
	if(NAME_2QUE == 15) {
		mes "[���c]";
		mes "�c�c�܂��c�c�����c�c";
		next;
		mes "[���c]";
		mes "�c�c";
		mes "���x���c�c�ʔ����c�c";
		mes "�b���c�c���āc�c�����́H";
		next;
		input '@str$;
		mes "[���c]";
		mes "�����c�c�ςȎ��c�c�΂���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�����͊�����ɗ����킯����Ȃ��I";
		mes "�@�������𓾂Ȃ��ƁI�j";
		next;
		if(select("�ދ��ł͂���܂��񂩁H","�O�ňꏏ�ɗV�т܂��񂩁H")==2) {
			mes "[���c]";
			mes "����́c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "���́c�c�c�c���c������c�c�c�c";
			mes "�����Ɂc�c�c�c���Ȃ��Ɓc�c";
			close;
		}
		mes "[���c]";
		mes "�c�c";
		mes "�_���B���c�c�Q�鎞��";
		mes "�c�c�H�������āc�c";
		mes "�����Ɓc�c�c�c�ꏏ������c�c";
		next;
		mes "[���c]";
		mes "�c�c�c�c";
		mes "������c�c���v�c�c�c�c";
		mes "�c�c���肪�Ƃ��c�c";
		next;
		mes "[���c]";
		mes "�c�c�c�c";
		mes "�c�c�ł��c�c�c�c";
		next;
		mes "[���c]";
		mes "�_���B�́c�c�c�c";
		mes "�Ƒ��ɉ�����c�c�c�c";
		mes "�Ȃ��́c�c�c�c���c�c�c�c";
		next;
		mes "[���c]";
		mes "�c�c�c�c";
		mes "���ƂȂ��c�c�c�c";
		mes "�����v�����c�c�c�c";
		next;
		mes "[���c]";
		mes "�c�c�����c�c�c�c";
		mes "���ƈꏏ�c�c�c�c�����Ɓc�c�c�c";
		mes "���c�c�v�c�c���c�c";
		next;
		mes "[���c]";
		mes "�����́c�c�c�c";
		mes "��ꂽ����c�c�c�c";
		mes "�c�c�c�c���߂�B";
		set NAME_2QUE,16;
		close2;
		cutin "ra_bishop",255;
		end;
	}
	mes "[���c]";
	mes "�c�c�c�c�c�c�c�c";
	next;
	mes "[�M��]";
	mes "�����玸�炢�����܂��B";
	mes "���c�l�͂����ł��B";
	mes "�y���͂܂��ɂ��Ă��������B";
	close2;
	cutin "ra_bishop",255;
	end;
}

ra_temin.gat,293,144,0	script	ra_san0	139,3,3,{
	if(RA_2QUE != 4)
		end;
	mes "-�b�������Ă�l���B";
	mes "�@���΂炭�҂��Ă��悤-";
	close2;
	warp "ra_temin.gat",300,153;
	end;
}

ra_temin.gat,288,151,0	script	ra_san1	139,1,6,{
	if(RA_2QUE != 4)
		end;
	mes "-�ǂɎ����߂Â���ƁA�ׂ̕�����";
	mes "�@��l�̉�b���������n�߂�-";
	next;
	mes "[???��_��]";
	mes "���ɂ���āA����Ȏ�����";
	mes "�O���̐l�Ԃ�A��Ă���Ƃ́I";
	next;
	mes "[�W�F�h��_��]";
	mes "���́A�ŏ����炠�̎������N������";
	mes "�������s���������̂ł��B";
	mes "����Ȏ����������A������̎��s��";
	mes "���������̂Ȃ̂ł͂���܂��񂩁H";
	next;
	mes "[???��_��]";
	mes "�n�@�c�c�H";
	mes "�ł́A���O�ɂ�";
	mes "���̐ӔC���Ȃ��ƌ����̂��H";
	next;
	mes "[???��_��]";
	mes "����Ɋւ��ĉ����킩��Ȃ���";
	mes "����؂����Ȃ̂��H";
	next;
	mes "[�W�F�h��_��]";
	mes "����ł́A���̖��̗͂��o������";
	mes "���̂������Ƃł������̂ł����H";
	mes "�M�k�B�̐_���ȏꏊ�ł���";
	mes "�_�a�̕����܂ł����Ă����āI";
	next;
	mes "[�W�F�h��_��]";
	mes "�O���̖ڂ�����̂Ɂc�c";
	mes "�����܂ł���K�v������܂������H";
	next;
	mes "[???��_��]";
	mes "�c�c";
	mes "���̗͂��o�Ŗ�����\�ꂳ�����̂�";
	mes "�m���ɁA���̉߂��������B";
	mes "����͔F�߂�B";
	next;
	mes "[???��_��]";
	mes "�������������̂́A���̏d�v�Ȏ�����";
	mes "�O���̐l�ԂƋ��c����킹��K�v��";
	mes "�������̂��Ƃ������Ȃ̂��I";
	next;
	mes "[�W�F�h��_��]";
	mes "���́A�ނ���c�c";
	mes "�_�a���������̌������킩�炸�A";
	mes "��������Ă鋳�c���Ԃ߂�";
	mes "�悢�@��Ǝv���܂����B";
	next;
	mes "[�W�F�h��_��]";
	mes "������x�i�����܂����A���͂��Ȃ�����";
	mes "��������Ŕ閧���ɍs���Ă���s�ׂ�";
	mes "���}�Ɏ~�߂�ׂ����Ǝv���܂��B";
	next;
	mes "[�W�F�h��_��]";
	mes "���Έӌ��������闧��ł͂Ȃ���";
	mes "�킩���Ă��܂����c�c";
	mes "�F�߂���ł͂���܂���B";
	next;
	mes "[???��_��]";
	mes "�c�c�����I";
	mes "���������Ԃ��Ȃ����͏��m�̂͂��I";
	mes "�]�v�Ȑ^��������񂶂�Ȃ��I";
	next;
	mes "-��l�̐[���Șb�𓐂ݕ������Ă鎞�A";
	mes "�@�N�����̕����ɋߕt���C�z��������-";
	next;
	hideoffnpc "�j���G����_��#ra1";
	initnpctimer "�j���G����_��#ra1";
	cutin "ra_gwoman",2;
	mes "[???]";
	mes "���I�@���Ȃ����W�F�h��_����";
	mes "�A��Ă����M�p�ł���O���̐l�ł����H";
	next;
	mes "[�j���G����_��]";
	mes "�͂��߂܂��āI";
	mes "���̓j���G���Ɛ\���܂��B";
	next;
	mes "[�j���G����_��]";
	mes "���c�l�Ƃ̑Θb�͏I�����̂ł��ˁB";
	mes "����ŁA���c�l�Ɖy���������z��";
	mes "�ǂ��ł������H";
	next;
	menu "�C���[�W�ƈႢ������",-;
	cutin "ra_gwoman2",2;
	mes "[�j���G����_��]";
	mes "�t�t�b";
	mes "�悭�킩��܂��B";
	mes "���c�ƌ����΁A���ʂ͔N�z��";
	mes "�o����ς񂾕��ł�����ˁB";
	next;
	cutin "ra_gwoman",2;
	mes "[�j���G����_��]";
	mes "�������A";
	mes "�A���i�x���c�����̋��c�ɂȂ�ɂ�";
	mes "���ʂȏ������K�v�Ȃ̂ł��B";
	next;
	mes "[�j���G����_��]";
	mes "�_��g�߂Ɋ����鎖���ł���";
	mes "�g�̓I����������Ă��鎖�B";
	next;
	mes "[�j���G����_��]";
	mes "�������ɔ������B";
	mes "�����āA���E�F���Ⴄ���������������B";
	mes "���ꂪ�A���c�ɂȂ�ׂ̏����ł��B";
	next;
	mes "[�j���G����_��]";
	mes "����Łc�c";
	mes "���c�l�Ƃ́A����b�����̂ł����H";
	next;
	mes "-�ޏ��ɂ��W�F�h��_���ɕ񍐂�������";
	mes "�@��������b����-";
	next;
	mes "-����ƌW�����e�́A�W�F�h��_����";
	mes "�@�����ʂ�A��،���Ȃ�����-";
	next;
	mes "[�j���G����_��]";
	mes "�Ӂ[��c�c";
	mes "�܂��A��������܂���ˁB";
	next;
	mes "[�j���G����_��]";
	mes "�Ƃ���ŁA�x�P���g�c�c";
	mes "����A�W�F�h��_���Ƃ�";
	mes "�ǂ��Œm�荇�����̂ł����H";
	next;
	mes "-�x�P���g�H-";
	next;
	menu "�m�荇��������������b��",-;
	mes "-�W�F�h��_���ƒm�荇��";
	mes "�@���������ɂȂ��������̘b������-";
	next;
	mes "[�j���G����_��]";
	mes "�c�c";
	next;
	cutin "ra_gwoman2",2;
	mes "[�j���G����_��]";
	mes "�A�n�n�b�I";
	mes "�{���ɁA���ꂾ���̎���";
	mes "�l��M�p����Ȃ�āc�c";
	next;
	mes "[�j���G����_��]";
	mes "�{���Ɂc�c���Č����΂����̂��B";
	mes "�����l�Ȃ̂͂킩�邯�ǁc�c";
	next;
	mes "[�j���G����_��]";
	mes "�c�c�x�P���g�B";
	mes "������ʖڂȂ̂�B���Ȃ��́c�c";
	next;
	cutin "ra_gwoman",2;
	mes "[�j���G����_��]";
	mes "�]�v�Ȃ����b�����m��܂��񂪁c�c";
	mes "�������Ă����܂��傤�B";
	next;
	mes "[�j���G����_��]";
	mes "�W�F�h��_���ɂ́A";
	mes "�ߕt���Ȃ������g�ׂ̈ł��B";
	mes "�댯���D�ނ̂łȂ���΂ˁB";
	next;
	cutin "ra_gwoman",255;
	hideonnpc "�j���G����_��#ra1";
	stopnpctimer "�j���G����_��#ra1";
	mes "-���̌��t���c���ăj���G����_����";
	mes "�@��������o�čs����-";
	next;
	mes "-�ޏ��ƃW�F�h��_�����A";
	mes "�@�ǂ������֌W���킩��Ȃ����A";
	mes "�@�����Ă������ł͂Ȃ��悤���c�c-";
	next;
	mes "-�ׂ̕����̘b���I������悤���B";
	mes "�@�W�F�h��_���ɉ�ɍs���Ă݂悤-";
	set RA_2QUE,5;
	close;
}

ra_temin.gat,294,149,3	script	�j���G����_��#ra1	915,{
	end;
OnInit:
OnTimer120000:
	hideonnpc;
	end;
}

ra_temin.gat,272,143,0	script	ra_san2	139,3,3,{
	if(RA_2QUE != 6)
		end;
	mes "-����H";
	mes "�@���ŁA�����������Ă���-";
	next;
	if(select("�E��Ȃ�","�E��")==1) {
		mes "-�����̕��ł��Ȃ��̂ɁA";
		mes "�@�E���K�v�͂Ȃ����낤-";
		close;
	}
	mes "-�E���Ă݂�ƁA�����Ȍ��������B";
	mes "�@�ǂ��̌��Ȃ̂��܂ł͂킩��Ȃ�-";
	set RA_2QUE,7;
	close;
}

ra_temin.gat,28,319,0	script	rasan_warp	45,1,1,{
	if(RA_2QUE < 7) {
		mes "-�����|�����Ă��āA�J���Ȃ�-";
		close;
	}
	if(RA_2QUE > 7) {
		warp "ra_san01.gat",140,135;
		end;
	}
	mes "-�������A����֒ʂ�������̂悤���B";
	mes "�@�����A�����|�����Ă���B";
	mes "�@�ǂ����悤�c�c-";
	next;
	if(select("���߂�","�����g��")==1) {
		mes "-�����Ă͂����Ȃ��ƁA";
		mes "�@���ꂾ�����ӂ��ꂽ�񂾁c�c";
		mes "�@����̂͂�߂Ă�����-";
		close;
	}
	mes "-�W�F�h��_���̕����ŏE��������";
	mes "�@�h������ł݂�ƁA�s�v�c�Ȏ���";
	mes "�@�s�b�^���ƍ�����-";
	close2;
	warp "ra_san01.gat",140,135;
	end;
}

ra_san01.gat,139,13,0	script	rachelwarp4001	45,1,1,{
	if(RA_2QUE == 7) {
		warp "que_san04.gat",119,115;
		end;
	}
	switch(rand(3)) {
		case 0: warp "ra_san02.gat",213,275; end;
		case 1: warp "ra_san03.gat",119,283; end;
		case 2: warp "ra_san04.gat",119,110; end;
	}
}

que_san04.gat,119,115,0	script	ra_san3	139,2,2,{
	if(RA_2QUE != 7)
		end;
	mes "-���̏ꏊ�Ƃ͈Ⴄ�A�s�v�c�ȗ͂�";
	mes "�@��������c�c";
	mes "�@�������邩���ׂĂ݂悤-";
	close;
}

que_san04.gat,119,133,0	script	ra_san4	139,20,5,{
	if(RA_2QUE != 7)
		end;
	mes "-����!?";
	mes "�@���̒��ɉ�����������B";
	mes "�@�ߊ���Ă݂悤-";
	close;
}

que_san04.gat,119,203,0	script	ra_san5	139,7,7,{
	if(RA_2QUE != 7)
		end;
	mes "-���̒��ɂ���̂́c�c";
	mes "�@�ǂ����Ō�����������悤�ȁc�c";
	mes "�@�����I�@���~���̐S���̔j�Ђ��I-";
	next;
	mes "-�������A����Ȃɂ�������c�c-";
	next;
	mes "-���͂ȗ͂������~���̐S���̔j�Ђ�";
	mes "�@�ǂ����āA����ɂ���̂��c�c-";
	next;
	mes "-�s�v�c�Ɏv���A�l������ł����";
	mes "�@�N���̋C�z��������-";
	next;
	hideoffnpc "�j���G����_��#ra2";
	initnpctimer "�j���G����_��#ra2";
	cutin "ra_gwoman",2;
	mes "[�j���G����_��]";
	mes "�N���I";
	mes "����ɐ�����������҂́I";
	next;
	mes "[�j���G����_��]";
	mes "�Ӂ[��c�c";
	mes "�ǂ����Ō����悤�ȁc�c�H";
	next;
	cutin "ra_gwoman2",2;
	mes "[�j���G����_��]";
	mes "�c�c";
	mes "�W�F�h���A��ė����O���̐l�ł��ˁB";
	mes "����ȏ��ŁA�������Ă����ł����H";
	next;
	cutin "ra_gwoman",2;
	mes "[�j���G����_��]";
	mes "�܂����A���悾�ƒm�炸�ɓ������A";
	mes "�Ȃ�āA����Ȍ�����͂��܂����ˁB";
	next;
	mes "[�j���G����_��]";
	mes "�c�c";
	mes "�c�c�c�c";
	next;
	cutin "ra_gwoman2",2;
	mes "[�j���G����_��]";
	mes "�܂��A�����ł��傤�B";
	mes "�����Ă����܂����A���Ȃ��̂��A��";
	mes "�W�F�h�̗���́A���������Ȃ�܂���B";
	next;
	mes "[�j���G����_��]";
	mes "�����ɓ����Ă����O���̐l�Ԃ𖳎���";
	mes "�A����ɂ́A�s���Ȃ����ǁc�c";
	next;
	mes "[�j���G����_��]";
	mes "�W�F�h�̗��������̂ŁA���񂾂���";
	mes "�ڂ��Ԃ��Ă����܂��傤�B";
	next;
	sc_start3 SC_BLIND,0,0,0,0,600000,10;
	mes "-�����������j���G�����������������";
	mes "�@�C�������Ȃ�n�߂�-";
	close2;
	cutin "ra_gwoman",255;
	hideonnpc "�j���G����_��#ra2";
	stopnpctimer "�j���G����_��#ra2";
	set RA_2QUE,8;
	warp "rachel.gat",163,152;
	end;
}

que_san04.gat,122,200,3	script	�j���G����_��#ra2	915,{
	end;
OnInit:
OnTimer120000:
	hideonnpc;
	end;
}

rachel.gat,163,152,0	script	ra_san6	139,3,3,{
	if(RA_2QUE != 8)
		end;
	mes "-�C���t���Ď�����m���߂�ƁA";
	mes "�@���̌i�F���ڂɓ�����-";
	sc_end SC_BLIND;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����́c�c���w���c�c�H";
	mes "��́A�ǂꂾ���C�������Ă����̂��B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���������ɂނ��A";
	mes "�����W�F�h��_���ɉ��Ȃ���΁c�c";
	set RA_2QUE,9;
	close;
}

//============================================================
// �u���[�̍s���N�G�X�g
//- Registry -------------------------------------------------
// RA_3QUE -> 0�`24
//------------------------------------------------------------
ra_in01.gat,235,194,5	script	�J�b�e�B���O�V���G��	931,{
	switch(RA_3QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�J�b�e�B���O�V���G��]";
		mes "���}�ɐ����鎖���A";
		mes "�ǂꂾ����ς��m���Ă��邩�H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�h��Ȑl���𑗂���A";
		mes "���}�Ɂc�c�ڗ������ɐ�����̂�";
		mes "�����Ƃ����Ɠ���񂾁c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���́A�܂��Ⴂ���c�c";
		mes "����ȏ�A���������c�c";
		mes "���̉e�����󂯂��c�c";
		mes "���}�ɐ����Ă������c�c";
		if(LHZ_3QUE == 16 && RA_3QUE == 0)
			set RA_3QUE,1;
		close;
	case 3:
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�N�́A����ȂɉɂȂ̂��H";
		mes "���R�������A���ɘb������Ƃ́c�c";
		mes "�܂��c�c���������N���Ȃ񂾂ȁc�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c���l�H";
		mes "�c�c�����A�̘̂b���B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���̎��Ƃ́A���̊֌W�Ȃ��b�c�c";
		mes "���́A�N�Ƃ��ւ�肽���Ȃ��񂾁I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ӂ��c�c";
		set RA_3QUE,4;
		close;
	case 4:
		mes "[�J�b�e�B���O�V���G��]";
		mes "�܂��A��������̂��H";
		mes "����ȂɉɂȂ�A�b�����肮�炢�ɂ�";
		mes "�Ȃ��Ă����Ă��������c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "����A�b�����肪�~������ł�";
		mes "�Ȃ��݂������ȁB";
		mes "�Ȃ�A�������Ƃǂ����֍s���Ă���B";
		close;
	default:
		break;
	case 10:
	case 11:
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�������A���x�͉��̗p��!!";
		mes "����V�їF�B��������";
		mes "���Ⴂ���Ă�񂶂�Ȃ��̂��H";
		next;
		input '@str$;
		if('@str$ == "���q�^���[��") {
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c���q�^���[���H";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c�c�c";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "���ꂪ�ǂ������H";
			mes "���̃A���i�x���c�ł͂Ȃ��A";
			mes "�V���o���c�o���h�̓s�s�����Ď��́A";
			mes "�m���Ă��邪�c�c";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�������́A�n���X���ď��������āA";
			mes "��������ς����Ď��͕����Ă���B";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�ł��A���ꂭ�炢�����m��Ȃ���B";
			mes "����ȏ��ɂ͍s���������Ȃ�����ȁI";
			next;
		}
		else if('@str$ == "�u���[") {
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c";
			mes "���̖��͋v���Ԃ�ɕ������ȁB";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�m���A���̊X�ň�Ԃ̔��l�������B";
			mes "�A�C�h���I�ȏ�����������c�c";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c�����m���Ă���̂́A";
			mes "���ꂾ�����I";
			next;
		}
		else if('@str$ == "�t���C���̐�") {
			mes "[�J�b�e�B���O�V���G��]";
			mes "�t���C���̐�c�c";
			mes "�����́A�J�b�v����N��肪�D��";
			mes "����Ό����݂����ȏ����B";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "���Ƃ͊֌W�Ȃ��B";
			mes "���炭�A�N�������Ƃ͖������낤�B";
			mes "�s���������ʂ��ȁB";
			next;
		}
		else {
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c" +'@str$+ "�H";
			mes "��������́B";
			mes "�Ӗ����킩��Ȃ��ȁB";
			close;
		}
		mes "[�J�b�e�B���O�V���G��]";
		mes "�����A�������H";
		mes "�`���҂́A�ό��ł����Ă�΂����񂾁B";
		mes "���������Ɏ��˂������";
		mes "���������K�v���������낤�H";
		set RA_3QUE,11;
		close;
	case 15:
		if(countitem(7571) < 1)
			break;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�܂��N���c�c";
		mes "�`���҂��Ă̂́A����ȂɉɂȂ̂��H";
		mes "�ʂɉ��ɗp�Ȃ�ĂȂ����낤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�J�b�e�B���O�V���G������c�c";
		mes "�������B���������́c�c";
		mes "�ǂ����܂����H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�͂��H";
		mes "�ǂ����āA����Ȏ��𕷂��񂾁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��́A�R�����܂���ˁB";
		mes "�������B���Ă��鎖�ɂ��Ă�";
		mes "�m��Ȃ��ƁA�����v�킹��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����āA�{�����o�Ȃ��悤��";
		mes "�b�𑁂��I��点�悤�Ƃ��܂��B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����āA�B��������������������c�c";
		mes "������ǂ����ɉB���B";
		mes "�B���Ȃ����͂��ꂪ������̂�����A";
		mes "�����Ō����鎖�ɂȂ�B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ʔ����b�����c�c";
		mes "���ɂ͊֌W�Ȃ��b���I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�֌W�̖����b�����X�ƕ��������̂�";
		mes "��������Ȃ񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ƍߎ҂Ƃ́c�c";
		mes "�����ɓs���̈�������������Ȃ���";
		mes "�S�z����]��A���i����͑z���ł��Ȃ�";
		mes "�s��������ꍇ������܂��B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ����A�����Ȃ���T�����߁A";
		mes "�u���[����̉Ƃ̑O��������Ă܂�";
		mes "�m�F�������������́A����ł��傤�I";
		next;
		mes "-�J�b�e�B���O�V���G����";
		mes "�@���L���𓊂������B";
		mes "�@���L���̓y�[�W���J�����܂�";
		mes "�@�ނ̑����ɗ�����-";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����킩���Ă��ł���I";
		mes "�u���[������E�����Ɛl�c�c";
		mes "�J�b�e�B���O�V���G��!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		set RA_3QUE,16;
		delitem 7571,1;
		close;
	case 16:
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�������Ȍ����������";
		mes "��߂Ă���Ȃ����H";
		mes "�S�R�A�b�������Ȃ��ȁB";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "����ɁA���̃{�����m�[�g�͉����H";
		mes "�S�~���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�J�b�e�B���O�V���G������B";
		mes "���Ȃ��́A���X";
		mes "���̊X�̐l�ł͂���܂���ˁH";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��́c�c";
		next;
		switch(select("�Z���_������̉�","���q�^���[��","�t���C���̐�","�u���[")) {
		case 1:
			mes "[" +strcharinfo(0)+ "]";
			mes "�Z���_������̉ƂɏZ�ݒ�����";
			mes "���󂾂����̂ł��I";
			break;
		case 3:
			mes "[" +strcharinfo(0)+ "]";
			mes "�t���C���̐�ɏZ�ݒ�����";
			mes "�����X�^�[��������ł��I";
			break;
		case 4:
			mes "[" +strcharinfo(0)+ "]";
			mes "���Ȃ����A�u���[�Ȃ̂ł��I";
			break;
		case 2:
			mes "[" +strcharinfo(0)+ "]";
			mes "���Ȃ��́A";
			mes "���q�^���[���ɏZ��ł������A";
			mes "���炩�̎���ŁA";
			mes "�����ɓ����ė����̂ł��B";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c�c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���Ȃ��́A";
			mes "���̉ߋ����B���Ă��܂����c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�̂̍߂��\����āA";
			mes "�d�Ԃ��������̂��|�������̂��c�c";
			mes "����Ƃ��A�ߋ��̍���";
			mes "����Ă�̂��܂ł́A�킩��܂���B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�������A���̉ߋ���";
			mes "�m�肽�����Ă����l�����܂����B";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���Ȃ��̎��������ƒm�肽����A";
			mes "�D��S�������A���`���̈���l���I";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�c�c���邳���I";
			mes "���ɂ͊֌W�Ȃ������I";
			mes "����ȏ�A���������Ȃ�!!";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���̐l�́c�c";
			next;
			switch(select("�Z���_������Ƃ̋���","�t���C���̐�̂��k����","�u���[")) {
			case 1:
				mes "[" +strcharinfo(0)+ "]";
				mes "�Z���_������Ƃ̋���ł��I";
				mes "����̂����ɗ]�v�Ȏ��܂�";
				mes "�m�肽�����Ă�����ł��B";
				break;
			case 2:
				mes "[" +strcharinfo(0)+ "]";
				mes "�t���C���̐�ɂ��邨�k����ł��I";
				mes "�N�z�����ǁA����D��S��";
				mes "�����Ă��Ȃ������̂ł��B";
				break;
			case 3:
				mes "[" +strcharinfo(0)+ "]";
				mes "���Ȃ��̗��l������";
				mes "�u���[����ł�!!";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "�ߋ����B�����Ȃ��ɕs����������ޏ���";
				mes "���q�^���[���Ƃ����肪����������A";
				mes "���Ȃ��̉ߋ��𒲂ׂĂ����̂ł��B";
				next;
				mes "[�J�b�e�B���O�V���G��]";
				mes "�c�c�c�c";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "���Ȃ��̉ߋ���m���Ă��܂����c�c";
				mes "���`���̋����ޏ��Ƃ��ẮA";
				mes "�����Ă͒u���Ȃ������̂ł��傤�B";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "�c�c���Ȃ����ߋ���m�����ޏ���";
				mes "�����Ă͒u���Ȃ������̂ł��傤�B";
				mes "������c�c������c�c";
				mes "�������N������ł��B";
				next;
				mes "[�J�b�e�B���O�V���G��]";
				mes "�c�c���̘b���A�킩��Ȃ��ȁI";
				mes "��́A�������������񂾁H";
				mes "�����c�c�����킩��Ȃ��I";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "�܂�����؂����ł����I";
				mes "���Ȃ��́c�c";
				next;
				if(select("�Z���_���̉�","�t���C���̐�")==1) {
					mes "[" +strcharinfo(0)+ "]";
					mes "�Z���_������̉Ƃ�";
					mes "���Ă͂Ȃ�Ȃ����i��";
					mes "�ڂɂ��Ă��܂��c�c�i�����j";
					break;
				}
				mes "[" +strcharinfo(0)+ "]";
				mes "�t���C���̐�c�c";
				mes "���Ȃ��͂����ŁA�u���[�����";
				mes "��ɓ˂����Ƃ����I";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "�؋��������ׂɁc�c";
				mes "���l�������ޏ����c�c";
				mes "�����̍߂��B���ׂɎE������ł�!!";
				next;
				mes "[�J�b�e�B���O�V���G��]";
				mes "�c�c�Y����!!";
				mes "�؋����Ȃ��ȂɁA";
				mes "���������Ď����^���Ă���̂�!!";
				mes "������������邼�I";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "����ł����S�ł��Ȃ����Ȃ��́A";
				mes "������̏؋��������̂ɕK���Łc�c";
				next;
				mes "[" +strcharinfo(0)+ "]";
				mes "����������ƁA���̏؋��Ƌ���";
				mes "�V���Ȏ��������o������";
				mes "���Ă����̂�������Ȃ��I";
				next;
				mes "[�J�b�e�B���O�V���G��]";
				mes "�c�c�T��S�b�R�́A���̕ӂɂ��Ă����I";
				mes "�ʔ������������c�c";
				mes "�����A�t�������Ă����Ȃ��I";
				mes "����ȏ�́A��������!!";
				set RA_3QUE,17;
				close;
			}
			break;
		}
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "����́c�c�M���O���ȁH";
		mes "�S�R�ʔ����Ȃ����B";
		mes "�N�̓Z���X���Ȃ��ȁB";
		next;
		mes "-���܂����I";
		mes "�@�������Ԉ���Ă����݂�����-";
		close;
	case 17:
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ʔ����b�����A�����^���Ă���悤��";
		mes "���ɕs�������B";
		mes "���̓��L���́A�Еt���Ă���B";
		mes "�s�����ɂ܂�Ȃ��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��́A���̓��L���n���������āc�c";
		mes "�{���̎���m���Ă��邩������Ȃ�";
		mes "�Z���_��������n������ׂɁc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��́A�Z���_������̉Ƃ̋߂���";
		mes "�����Ƒ҂������Ă��܂����ˁI";
		mes "�����A�@��͂߂��A���ǖ�����";
		mes "�I������̂ł͂Ȃ��ł����H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�z���͂��L�����ˁB";
		mes "�����ł���������ǂ������H";
		mes "�ŁA�l���^���͖̂ʔ������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���̓��L��ǂ�ł݂Ă��������B";
		mes "���Ȃ����n�����������Ă����ł����c�c";
		mes "�Ƃ肠�����A��x�����ł��ǂ�ł݂���";
		mes "�ǂ��ł��H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "��́A���́c�c";
		mes "���Ɖ��̊֌W���Ȃ��l�̓��L���c�c";
		mes "���́A�ǂ܂���񂾁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��A����Ȏ��������̂ł���!?";
		mes "�܂��A�ǂ�ł݂Ăƌ������ł��傤�I";
		mes "���Ȃ��Ɗ֌W�����邩�ǂ����́A";
		mes "�ǂ�Ō���΂킩��͂��ł�!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�N�b�c�c";
		set RA_3QUE,18;
		close;
	case 18:
		mes "-�ނ͕��G�ȕ\��ŁA";
		mes "�@���ɗ����Ă������L���E����";
		mes "�@�������ǂݎn�߂�-";
		next;
		mes "-��������-";
		mes "���͔ނ��D���B�ł��A�ނ͎�����";
		mes "�ߋ��������Ęb���Ă͂���Ȃ��B";
		mes "��́A�ߋ��ɉ����������̂��H";
		mes "����Ƃ��c�c�����ł͉J�h���";
		mes "���Ă邾��������A���������Ȃ��̂��H";
		mes "������l���Ă��A���͏o�Ȃ��B";
		next;
		mes "�s���c�c�ނ͓ˑR�����ɗ����悤�ɁA";
		mes "�܂��A�ˑR�����Ă��܂����낤���H";
		mes "����Ȏ��̕s�����킩���Ă�̂��ȁc�c";
		mes "�킩��Ȃ��c�c";
		mes "�������A�^�b�N����΁A";
		mes "�����͓����Ă���邩�ȁH";
		mes "���̎��܂ŁA�撣�낤�I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ƂĂ��������L���ˁB";
		mes "�����̏��������͂ƍ\���A���̂��̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u�c�u�c���킸��";
		mes "�������ǂ�ł��������B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "-��������-";
		mes "���[��c�c";
		mes "�������B���Ă�̂͂킩�������ǁA";
		mes "�ǂ����c�c���������������悤���B";
		mes "�b��؂�o���ƁA�ƂĂ������邵�A";
		mes "�s�������ɂ���c�c";
		mes "�K���ɘb������炻���Ƃ���c�c";
		next;
		mes "����ȂɋC�̏������ނ��B�����Ȃ�c�c";
		mes "����ς�̂̏��̎��Ȃ̂��ȁH";
		mes "����Ƃ��A�����ۂ��Ȏ��Ȃ̂ɁA";
		mes "�o����̂����Ȏ��Ƃ��H";
		mes "�����I�@���ǂ������I";
		mes "�b���Ă����΁A�y�ɂȂ�̂ɁB";
		next;
		mes "�b���Ă����΁A�����D��������";
		mes "������̂Ɂc�c�{���Ɂc�c�����I";
		mes "�܂��A�ߋ��̎��͂킩��Ȃ��B";
		mes "�ނ𗝉��ł���悤�撣�낤�I";
		next;
		mes "�ււ��I";
		mes "�ނ̎����S�������ł��āA";
		mes "���̂�������ɏЉ�o�������";
		mes "����Ƃ����̂ɂȁc�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c";
		mes "�t�b�I�����b���c�c";
		next;
		mes "-��������-";
		mes "���b�z�[�I";
		mes "����Ƃ킩�����I�ނ̉ߋ�!!";
		mes "�ȑO��炵�Ă����X�̖��O���������ǁA";
		mes "���ꂾ���ł����܂ł̓w�͂̎�����!!";
		next;
		mes "�ł��A����ȊO�́A�܂��ł̒��c�c";
		mes "����ς�A�������ڂ��̊X�ɍs����";
		mes "���ׂ邵���Ȃ��̂��ȁH";
		mes "�����|�����ǁc�c";
		next;
		mes "�ނ̉ߋ��ɏo��鎖�̓h�L�h�L�I";
		mes "�ʂ��Ĕނɂ́A�ǂ�ȉߋ����c�c";
		mes "��́A�ǂ�Ȏ������킩��̂��ȁH";
		next;
		mes "�ނ̉ߋ���m���Ă��܂�������";
		mes "�ނ͂ǂ�Ȋ�����邾�낤���c�c";
		mes "�����ƁA�����ł��傤�I�@���ւ��I";
		mes "�o���͖����B";
		mes "�����s����I�@���q�^���[���I";
		mes "�撣���āA�u���[�I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "-��������-";
		mes "�c�c���q�^���[���ɍs���ė����B";
		mes "�l���Ă������A�����Ƃ����Ɓc�c";
		mes "���낵������m���Ă��܂����B";
		mes "�����c�c�����鎖����Ȃ������񂾁B";
		mes "�ނ���͂ƂĂ������鎖�ł͂Ȃ��c�c";
		next;
		mes "�ł��c�c����ł��c�c";
		mes "���ɂ����́A�����ė~���������B";
		mes "�h�����낤���ǁA�����炱���c�c";
		mes "����M���āA�����ė~���������I";
		next;
		mes "�ނ��猾���ĖႦ�Ȃ�����c�c";
		mes "�����Œ��ڒ��ׁA";
		mes "��ɂ����̂́A���낵���ނ̉ߋ��c�c";
		mes "�������߂����c�c";
		next;
		mes "������!!�@������m�����ȏ�A";
		mes "�����Ƃ͏o���Ȃ��c�c";
		mes "���ӁA�ނƃt���C���̐�Řb�����悤�B";
		next;
		mes "�����̓��L�͊y�����b���������";
		mes "�����Ȃ��c�c�n�@�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�u���[�c�c";
		mes "����c�c���́c�c�Ⴄ�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ޏ��̓��L�́A�����ŏI���܂����B";
		mes "�ޏ��́A���Ȃ��̎���";
		mes "����Ȃɂ��^���Ɏv���Ă����̂ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ȃ̂ɁA���Ȃ��͔ޏ����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̒�ɗ��Ƃ����̂ł�!!";
		mes "�t���C���̐�̗₽�����̒��ցc�c";
		mes "�܂��c�c����؂����ł����H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�Ⴄ�I�@������Ȃ��񂾁I";
		mes "�ق�I�@���̓��L�̒���";
		mes "���̖��O�͏o�Ă��Ȃ�����Ȃ���!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "����Ȏ��ŔƐl�ɂ��悤���Ȃ�āc�c";
		mes "����c�c�܂�c�c����Ȃ���!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�N�b�c�c";
		mes "���񂽂��Đl��!!";
		set RA_3QUE,19;
		close;
	case 19:
	case 20:
		if(RA_3QUE == 19 || countitem(1201) < 1) {
			mes "[�J�b�e�B���O�V���G��]";
			mes "���͉������I�@�^����Ȃ��!!";
			mes "���́c�c�����A��������ĂȂ��񂾁I";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�������́c�c���̏����E���Ǝv���H";
			mes "����A�����A���ɎE�����Ƃ��Ă��A";
			mes "���̉ߋ��ɐl���E���Ă܂Ŏ��";
			mes "����������Ǝv�����H";
			mes "����Ȗ󖳂����낤�H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�܂��c�c";
			mes "����Ȏ����c�c�I";
			next;
			mes "[�J�b�e�B���O�V���G��]";
			mes "�n�c�c�n�n�n�c�c�n�@";
			mes "���͈Ⴄ�B";
			mes "���́c�c";
			mes "���́A����Ă��Ȃ�!!";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c";
			next;
			mes "-�����ꉟ���œf���������c�c-";
			next;
			mes "-�ނ̉ߋ����v���o������悤��";
			mes "�@����I�ȕ�����������΁A";
			mes "�@���S�Ɏ�����������Ǝv�����c�c-";
			next;
			mes "-�ނ����������̂��H�����āA";
			mes "�@���̍s���Ɗ֌W���镨�́c�c-";
			next;
			mes "-�ǂ����A����̓��w���ł͂Ȃ��A";
			mes "�@���q�^���[���ł̍s���ɍi����";
			mes "�@�l����̂��悳������-";
			set RA_3QUE,20;
			close;
		}
		mes "[�J�b�e�B���O�V���G��]";
		mes "���́c�c�������c�c";
		mes "���͌������I";
		mes "�����́A���w���̏Z���Ȃ̂�!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��������Ă��������B";
		mes "���Ȃ��Ȃ�A���ꂪ���Ȃ̂�";
		mes "����������Ǝv���܂����B";
		next;
		mes "-�J���[��-";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c";
		mes "�c�c���c�c����́c�c";
		mes "���̃i�C�t�́c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c�܂����c�c!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c����Ȃ͂����c�c";
		mes "�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�H�H�H�H]";
		mes "�������Ă�񂾁I�@�o�čs���I";
		mes "���͍��A�x�x�ŖZ�����񂾂�I";
		mes "�����Ԃ�v���Ԃ肾����A";
		mes "�݂��Ƃ��Ȃ��i�D�ōs����";
		mes "�����ɏ΂��邩��ȁB";
		next;
		mes "[�H�H�H�H]";
		mes "�ʓ|�������ȁc�c";
		mes "�܂��A�v���Ԃ肾���A";
		mes "�����Ƃ����i�D������̂�";
		mes "�ǂ��������ǂȁc�c";
		mes "�������A�ʓ|�������c�c";
		next;
		mes "[�H�H�H�H]";
		mes "�ǂ������񂾁H";
		mes "���ɂȂɂ��p�H";
		mes "�������ǁA���͖Z���c�c";
		mes "�O�b�c�c";
		next;
		mes "[�H�H�H�H]";
		mes "�������c�c";
		mes "���c�c�c�c�����c�c";
		mes "�����ێ��c�c";
		mes "���c�c�{���ɉ^���Ȃ��ȁc�c";
		next;
		mes "[�H�H�H�H]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�E�A�@�@�@�@�@�@�@�@�@�@�b!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�E�A�@�@�@�@!!";
		mes "�������������I";
		mes "�����疽�߂��ꂽ�Ƃ��Ă��c�c";
		mes "����������񂾁c�c���̎�Łc�c";
		mes "�����c�c�Y�ꂽ���񂾁c�c";
		mes "�����Ă���c�c�N�b�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�J�b�e�B���O�V���G������H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�킩�����B";
		mes "�S���ł��������B";
		mes "�ŏ����炱������ׂ��������B";
		mes "����ȁc�c����΂��肷��̂��c�c";
		mes "���̉^���Ȃ̂��ȁc�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�N�̌����ʂ�c�c";
		mes "���̓��q�^���[���̐l�Ԃ������B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�X�̎����ێ���S������";
		mes "�Ԑl�������񂾁c�c";
		mes "���͐��藧�Ă̐V�l���������A";
		mes "���̎��͑�ςȎ����Łc�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���ɉ����ꂽ�ŏ��̖��߂́c�c";
		mes "�����ׂ̈ɕn���X�̘A���ɋ��͂���";
		mes "���ΐ��h�̈�����E�����B";
		mes "�����c�c���ꂾ�����B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�l���E�����񂾁c�c";
		mes "���̎�Łc�c";
		mes "�N�������Ă���̂Ɠ����A";
		mes "�����̃i�C�t�Łc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�|�������B";
		mes "������ꂽ���Ƃ͂����c�c";
		mes "�����~���������̂����������c�c";
		mes "���͕|�������c�c";
		mes "�l�X�̖ڂ��c�߂�Ƃ����������c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "��ɂ͎E�����l�̌��o����������A";
		mes "�Q�Ă��A�E�����l�������ɂގp�΂���";
		mes "���Ō��Ă����c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�����A���Ȃ�Ăǂ��ł��悩�����B";
		mes "����ȏ�A���q�^���[���ɂ��鎖�́c�c";
		mes "���ɂ͏o���Ȃ������B���E�������B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���́c�c�ߋ����瓦���ׂɁc�c";
		mes "�߈������瓦���ׂɁc�c";
		mes "���q�^���[�����������B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ߋ���S�ď������͂ł��Ȃ��������A";
		mes "���ԂƋ��ɍ߈����͔����Ȃ�A������x";
		mes "���₩�ɉ߂��������ł����c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�������A";
		mes "���̈��炬�������͑����Ȃ������I";
		mes "���Ɉ��炬��^���Ă��ꂻ��������";
		mes "�u���[�ƕt�����������A�ޏ��́c�c";
		mes "���̉ߋ���T��o�����Ƃ����񂾁c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�~�߂悤�Ƃ����I";
		mes "�ߋ��Ȃ�Ă���Ȃ��ƁI";
		mes "���x���������������I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ł��A�ޏ���!!";
		mes "�����̍D��S�ɑς���ꂸ��";
		mes "���q�^���[���܂ōs����";
		mes "���̉ߋ���T�����I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�B�����������ߋ����I";
		mes "�E�E�b�c�c�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����Łc�c";
		mes "�ޏ����E���Ă��܂����̂ł����H";
		mes "�����̍߂��B���ׂ����ɁH";
		mes "�����Ȃ�ł���!?";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�Ⴄ�I�c�c������c�c�I";
		mes "���͂���Ă��Ȃ��I���̂������񂾁I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�t���C���̐�Ō����܂����Ă���A";
		mes "�ޏ��͂��̏�̐����Łc�c";
		mes "���𓥂݊O���c�c�M��Ă��܂����B";
		mes "����������񂶂�Ȃ��񂾁I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c���̉ߋ��Ȃǁc�c�T�邩��I";
		mes "����Ȗڂɑ����񂾁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ȍ������������Ȃ�āI";
		mes "�c�c���H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���݂����ȁc�c";
		mes "�����Ȓj�ɍ\������c�c����Łc�c";
		mes "����Ȗڂɑ����āc�c���������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�J�b�e�B���O�V���G������c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�N�b�c�c���̌�́c�c";
		mes "�N�̐����ʂ肾�B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ߋ����B���ׂɔƍ߂��d�˂�";
		mes "�j�ڂɂȂ�Ƃ́c�c";
		mes "�n�@�c�c�n�@�c�c";
		set RA_3QUE,21;
		close;
	case 21:
		if(countitem(1201) < 1) {
			mes "[�J�b�e�B���O�V���G��]";
			mes "���ǁc�c";
			mes "���͉ߋ��̍߂��Ō�܂�";
			mes "�w�����čs���Ȃ���΂Ȃ�Ȃ�";
			mes "�^���Ȃ񂾁B";
			mes "���ꂪ�A���������Ԃ�����";
			mes "�傫���ďd���\���˂��Ă킯���B";
			close;
		}
		mes "[�J�b�e�B���O�V���G��]";
		mes "���̎��ȂǕ����Ă����Ă����΁c�c";
		mes "�ǂ����āA���ɍ\���񂾁I";
		mes "�ǂ����āc�c�ǂ����āc�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�I";
		mes "���̃i�C�t�I�@�݂��Ă���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ǁA�ǂ����B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c";
		mes "���̃i�C�t�ŁA���͐l���E�����I";
		mes "�����m��Ȃ��N���c�c";
		mes "�������߂��ꂽ����c�c";
		mes "�|���I�c�c�|���񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�J�b�e�B���O�V���G������H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���͎��ɂ����Ȃ��I";
		mes "�Ƃ����߂͋��낵�����ǁc�c�ł��A";
		mes "���͖��߂���Ďd���Ȃ�������񂾁B";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�u���[�I";
		mes "����ɔ閧��T�����ޏ��������񂾁c�c";
		mes "���́A�����Ȃ��I�@�����āI";
		mes "�����Ă���I";
		mes "���c�c�O�t�b�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "�J�A�J�b�e�B���O�V���G������I";
		mes "��Ȃ��ł���I";
		mes "����Ȃɂ�낯�Ă���c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���I�@�����c�c���B";
		mes "���L���ƃi�C�t�̎n�������Ȃ���΁I";
		next;
		mes "-�t���b�I-";
		next;
		mes "-�����b�I-";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "���c�c�������c�c�I";
		mes "�E���[�[�b�I";
		next;
		mes "-�o�^���I-";
		next;
		mes "-�ނ̓i�C�t���������܂܁A";
		mes "�@�t���t���ƕ���������ǁA";
		mes "�@���̓��L���ɑ�������ē|�ꂽ-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c���v�ł����H";
		mes "�J�b�e�B���O�V���G������H";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ɂ��c�c�I�@�ɂ��c�c�I";
		mes "���ɂ����Ȃ���c�c�I";
		mes "�����c�c�i�C�t���c�c�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c�H";
		mes "���I�@�i�A�i�C�t��!?";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�u���[�̓��L���ɑ�������c�c";
		mes "�����Ă����i�C�t���h����Ȃ�āc�c�I";
		mes "�n������c�c�n������A���̓�l��";
		mes "�����Ă�ł�̂�������Ȃ��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c!!!!";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�ɂ��c�c�I";
		mes "���ɂ����Ȃ��c�c�����āc�c�I";
		mes "�ǂ��ɂ����܂Ő������т��̂Ɂc�c";
		mes "���肢�I�@�����āI";
		mes "����ȕ��Ɏ��ɂ����Ȃ�!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�C�t����邩��A��𗣂��āI";
		mes "�����Ă���Ɣ����Ȃ�����Ȃ����I";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�����I";
		mes "�����ȁc�c�I";
		mes "�ɂ��̂́c�c���Ȃ񂾁I�@���肢�I";
		mes "���ɂ����Ȃ��I�@������!!";
		mes "���́c�c�ǂ�����!?";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c����ȏ�A��������c�c��";
		mes "���X�͑��肽���c�c�Ȃ��c�c";
		mes "�����āc�c���˂��c�c";
		next;
		mes "[�J�b�e�B���O�V���G��]";
		mes "�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����܂肾�c�c";
		mes "����Ȏ��ɕ����Ȃ��Ă��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�t���C���̐�c�c";
		mes "�s���Ă݂邩�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�J�b�e�B���O�V���G���c�c";
		mes "���Ȃ��́c�c";
		set RA_3QUE,22;
		close;
	case 22:
	case 23:
	case 24:
		mes "[" +strcharinfo(0)+ "]";
		mes "����Łc�c�I���܂����B";
		mes "���Ȃ��̌���ɖ������l����";
		mes "�I���c�c";
		mes "�i���Ƒ�������Ɂc�c";
		close;
	}
	mes "[�J�b�e�B���O�V���G��]";
	mes "�N�́A�m���Ă邩�H";
	mes "�_�́c�c����A���̐��E�́c�c";
	mes "�߂�Ƃ����҂��΂ɋ����Ȃ��񂾁B";
	mes "���炬���c�c�����c�c";
	mes "�E�C���玸���c�c";
	next;
	mes "[�J�b�e�B���O�V���G��]";
	mes "������A�^������̂́c�c";
	mes "������鎖�����c�c";
	next;
	mes "[�J�b�e�B���O�V���G��]";
	mes "������āc�c";
	mes "������Ďc����������鎖�c�c";
	mes "�c�c�����Â���ł������B";
	mes "���ȏ�̋�ɁB";
	next;
	mes "[�J�b�e�B���O�V���G��]";
	mes "���ꂾ�����ߐl�ɋ����ꂽ";
	mes "�B��̎d�����c�c";
	next;
	mes "[�J�b�e�B���O�V���G��]";
	mes "�c�c�N�ɂ͓���b���낤�B";
	mes "�����c�c�����Ă킩��Ȃ��͂����B";
	mes "�����Ȃ��������ɂ��Ă���c�c";
	next;
	mes "-�ނ́A��������Ȃ�";
	mes "�@������Ă���̂��낤�c�c";
	mes "�@�ߋ��Ɉ�́A�����������񂾁c�c�H-";
	close;
}

ra_in01.gat,250,19,3	script	�Z���_��	929,{
	switch(RA_3QUE) {
	default:
		mes "[�Z���_��]";
		mes "�����̖����A�ŋߗ������Ă�݂������B";
		mes "���̊X�֍s���Ă���Əo�����Ă���A";
		mes "�܂��A���Ă��Ȃ��c�c";
		next;
		mes "[�Z���_��]";
		mes "�܂��A�ގ��Ɠ�l��";
		mes "���s�ɂł��s�����̂��낤�c�c";
		close;
	case 1:
		mes "[�Z���_��]";
		mes "�����̖����A�ŋߗ������Ă�݂������B";
		mes "���̊X�֍s���Ă���Əo�����Ă���A";
		mes "�܂��A���Ă��Ȃ��c�c";
		next;
		mes "[�Z���_��]";
		mes "�܂��A�ގ��Ɠ�l��";
		mes "���s�ɂł��s�����̂��낤�c�c";
		next;
		mes "[�Z���_��]";
		mes "�����͎��R�����c�c";
		mes "�e��S�z�����Ȃ��ŗ~�����B";
		mes "�����Ȃ��Ƃ͎v�����c�c";
		set RA_3QUE,2;
		close;
	case 2:
		mes "[�Z���_��]";
		mes "�����͎��R�����c�c";
		mes "�e��S�z�����Ȃ��ŗ~�����B";
		mes "�����Ȃ��Ƃ͎v�����c�c";
		close;
	case 4:
	case 5:
		mes "[�Z���_��]";
		mes "�����̖��́c�c";
		mes "�����Ȃ񂼕t���Ă��Ȃ��Ă�";
		mes "�������肪����q��������B";
		mes "�Ȃ��������肪�����ȁc�c";
		next;
		mes "[�Z���_��]";
		mes "����Ȃɋ������肶��Ȃ��̂ɁA";
		mes "����Ƃ����ɂ킩�鍁��Ȃ񂾁c�c";
		next;
		mes "[�Z���_��]";
		mes "�����A���������I";
		mes "���Ȃ񂾂��A�ǂ���烊�q�^���[����";
		mes "�s�����炵���B";
		mes "�������Ȃ�A�����ƃz�e�������邵";
		mes "���ɖ����Ȃ����낤�B";
		set RA_3QUE,5;
		close;
	case 8:
		mes "[�Z���_��]";
		mes "���������A�ǂ��ŗV��ł�����";
		mes "�m�肽�����āH";
		next;
		mes "[�Z���_��]";
		mes "�c�c�܂��A���L���𒲂ׂ��";
		mes "���������Ă��邩������Ȃ��ȁB";
		mes "���́A�������L�����Ă������B";
		next;
		mes "[�Z���_��]";
		mes "�c�c���Ƃ��Ă��A";
		mes "�v���C�o�V�[�͎��Ȃ��Ƃ����Ȃ��B";
		next;
		mes "[�Z���_��]";
		mes "�e��������āA����ɓ��L����";
		mes "�J������͂ł��Ȃ�����H";
		next;
		mes "[�Z���_��]";
		mes "���L���͂����̒I�ɂ����Ă��邪�A";
		mes "���͌�����肪�Ȃ��B";
		mes "�S�z�����ǁA�����Ɩ߂��Ă����";
		mes "�M���Ă���񂾁B";
		set RA_3QUE,9;
		close;
	case 9:
		mes "[�Z���_��]";
		mes "�O�ׂ̈Ɍ����Ă������A";
		mes "�e�ł��鉴�����āA";
		mes "���̓��L�͌��Ă��Ȃ��I";
		next;
		mes "[�Z���_��]";
		mes "�Ԃ̑��l�ł���N���A";
		mes "���̓��L������Ɍ����Ƃ�����A";
		mes "�ƂĂ�����Ȏ�����H";
		close;
	case 13:
		mes "[�Z���_��]";
		mes "���O���I";
		mes "���̕ӂ�������Ă�����Ă���";
		mes "�������z�́I";
		next;
		mes "[�Z���_��]";
		mes "��炦�I�@�K�E�I";
		mes "�Z���_�����ؓ��p�I";
		mes "�󕗐؂�!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "!?";
		next;
		mes "-�o�V��!!-";
		percentheal -50,0;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�b�I";
		mes "���������[���I�I";
		next;
		mes "[�Z���_��]";
		mes "���̖�Y�I";
		mes "�܂������Ă��₪�邩!!";
		mes "�����ꌂ�����������Ă�c�c";
		next;
		mes "[�Z���_��]";
		mes "��c�c�H�@���I�@���O�́I";
		mes "�O���炿�傭���傭�����ɗ��Ă�";
		mes "���l����Ȃ����I";
		next;
		mes "[�Z���_��]";
		mes "�c�c�͂͂���c�c�����������Ƃ��B";
		mes "������_���Ă����񂾂ȁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��k���L�c���ł���I";
		mes "�ǂ����Ď����A�X�g�[�J�[�Ȃ�āI";
		mes "�l�Ⴂ�ł�!!";
		next;
		mes "[�Z���_��]";
		mes "�����c�c�떂�����񂶂�ˁ[�I";
		mes "�����ƒɂ��ڂɍ��������̂��H";
		next;
		mes "[�Z���_��]";
		mes "�����z���Ǝv���Ă��̂ɂ�!!";
		mes "����ς�l�͌��|������";
		mes "�킩��Ȃ�����Ȃ񂾂ȁ[!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�p��������΁A";
		mes "���X�ƕ\��������ė��܂���!!";
		mes "�ǂ����āA";
		mes "�Ƃ̑O��������K�v�������ł��H";
		mes "����ł�����!!";
		next;
		mes "[�Z���_��]";
		mes "����Ȏ��́A�m���I";
		mes "���l���A�����l���Ă��邩�Ȃ��";
		mes "�킩��󂪂Ȃ�!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������A������������Ȃ��ł����I";
		mes "����ł����āI";
		next;
		mes "[�Z���_��]";
		mes "�R��������Ȃ����낤�I";
		mes "����������z�̊��";
		mes "�����ƌ�����ł͂Ȃ��񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�B�����������̂ɁA���ŉR����";
		mes "�K�v�������ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������A���͖`���҂ł��I";
		mes "�R�������́A���̑�������������";
		mes "�����葁���ł���!!";
		next;
		mes "[�Z���_��]";
		mes "�����В����Ă��!?";
		mes "�����A���O�̌�������M����Ǝv�����H";
		next;
		mes "[�Z���_��]";
		mes "���I�@���������āc�c";
		mes "���̖����ړ��Ă�!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���`���N�`�����Ȃ��c�c";
		mes "���́A�R�����Ă��܂���B";
		mes "���ꂩ��A���Ȃ��̖�����̎���";
		mes "�m��܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c����H";
		next;
		mes "[�Z���_��]";
		mes "�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ȉR�c�c�H";
		mes "�c�c���̎��H�c�c";
		mes "�B��������������΁c�c�R�����H";
		mes "�c�c�ӂށc�c";
		next;
		mes "[�Z���_��]";
		mes "���A�Ƃ茾�������Ă�񂾁H";
		mes "�Ƃ��Ƃ����������Ȃ����̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Z���_������B";
		mes "���́A���Ȃ��̒T���Ă�������҂ł�";
		mes "����܂���B";
		mes "�����āA���ɂ͂����Ƒ厖�Ȏ����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������������A";
		mes "���̌��Ƃ��֌W�����肻���Ȃ�Łc�c";
		mes "������ŁA���炵�܂��I";
		next;
		mes "[�Z���_��]";
		mes "�c�c���I�@����҂āI";
		mes "������̂�!?";
		set RA_3QUE,14;
		close;
	case 14:
		mes "[" +strcharinfo(0)+ "]";
		mes "�R�������R�́c�c";
		mes "���������Ȃ����A�B���������邩��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����Ɍ���闝�R�́c�c";
		mes "�o����̂��|������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��l�̊֌W���ؖ�����؋���";
		mes "�˂�����K�v������ȁc�c";
		next;
		mes "[�Z���_��]";
		mes "���O�A���v���H";
		mes "�ǂ����āA�}�ɓƂ茾�������񂾁H";
		close;
	case 22:
	case 23:
	case 24:
		mes "[�Z���_��]";
		mes "�����̖��́A���A��̂��ȁc�c";
		mes "���x�́A���Ȃ�x���ȁc�c";
		mes "�܂��A���킩�肪�����q������A";
		mes "����ȂɐS�z�͂��ĂȂ����ǁc�c";
		next;
		mes "[�Z���_��]";
		mes "�N�A���s���ɂ����̎q������������";
		mes "���̘V���������S�z���Ă�ƁA";
		mes "�`���Ă���Ȃ����H";
		close;
	}
}

rachel.gat,73,244,3	script	���Z������	919,{
	switch(RA_3QUE) {
	default:
		mes "[���Z������]";
		mes "���̗F�B�̃u���[�́A";
		mes "�{���ɂ����q�Ȃ́B";
		mes "�N�ɂł��e�؂ŁA�����Ő����ҁB";
		mes "�����������ǁc�c";
		mes "�����j��������A�����ɍ���Ă���B";
		next;
		mes "[���Z������]";
		mes "�����Ӓn������Ƃ������c�c";
		mes "��r�����鏊�����邯�ǁA";
		mes "��������͂�ˁI";
		next;
		mes "[���Z������]";
		mes "�͂��c�c";
		mes "�u���[�͗��l�����Ă����Ȃ��B";
		next;
		mes "[���Z������]";
		mes "�ŋߕt�������n�߂��炵�����ǁA";
		mes "���O���c�c���������l��������B";
		mes "�Ƃɂ����K�����̂ł����܂����I";
		next;
		mes "[���Z������]";
		mes "�������ŁA�u���[��";
		mes "�ŋߗV��ł���Ȃ����c�c";
		mes "�������������T���Ȃ��Ɓc�c";
		mes "�����₵���āc�c�������c�c";
		close;
	case 2:
	case 3:
		mes "[���Z������]";
		mes "�u���[�͗��l�����Ă����Ȃ��B";
		mes "�ŋߕt�������n�߂��炵�����ǁA";
		mes "���O���c�c���������l��������B";
		mes "�Ƃɂ����K�����̂ł����܂����I";
		next;
		mes "[���Z������]";
		mes "���[���A��������";
		mes "�u���[���ŋߗV��ł���Ȃ����c�c";
		mes "�������������T���Ȃ��Ɓc�c";
		mes "�����₵���āc�c�������c�c";
		set RA_3QUE,3;
		close;
	case 6:
		mes "[���Z������]";
		mes "���H�@�����H";
		mes "�����˂��c�c";
		mes "�u���[�́A�����������������Ă���B";
		next;
		mes "[���Z������]";
		mes "���R�Ȃ悤�Ŏ��R����Ȃ��B";
		mes "�ƂĂ���ۂɎc�鍁��B";
		next;
		mes "[���Z������]";
		mes "�c�c�u���[��{���Ă���́H";
		mes "���������΁c�c�����𒲂ׂ�";
		mes "�ǂ����̊X�֍s���Ƃ�";
		mes "�����Ă����ǁc�c";
		next;
		mes "[���Z������]";
		mes "���ꂩ�炵�΂炭����ĂȂ���ˁB";
		mes "�܂��A���̊X�ɂ���񂶂�Ȃ����ȁH";
		next;
		mes "[���Z������]";
		mes "�u���[���A";
		mes "���̊X�ł悭�s���Ă��ꏊ�ɍs���΁A";
		mes "�����肪���肪����Ǝv�����ǁc�c";
		set RA_3QUE,7;
		close;
	case 7:
		mes "[���Z������]";
		mes "�ǂ��֍s���Ă������ȁc�c";
		mes "���l������񂾂��A";
		mes "�f�[�g�ł悭�s�������ȏꏊ��";
		mes "�s���Ă��񂶂�Ȃ����ȁH";
		close;
	case 11:
	case 12:
		mes "[���Z������]";
		mes "����A�܂�������܂����ˁB";
		mes "���x�͂ǂ�������ł����H";
		mes "�����ʔ����b�ł��H";
		next;
		input '@str$;
		if('@str$ == "���q�^���[��") {
			mes "[���Z������]";
			mes "���q�^���[���H";
			mes "���c�c���������΁A";
			mes "�u���[�̓��q�^���[���̎���";
			mes "�m�肽�����Ă��܂����I";
			next;
			mes "[���Z������]";
			mes "���́c�c";
			mes "���̊X�̎��́A�悭�m��Ȃ��̂�";
			mes "���������Ă������Ȃ��������ǁc�c";
			next;
			mes "[���Z������]";
			mes "���R�͂킩��܂��񂪁A";
			mes "�u���[�����q�^���[����";
			mes "�����������Ă����̂͊m���ł��B";
			next;
			mes "[���Z������]";
			mes "�����̋������ǂ�����";
			mes "�킩��Ȃ����ǁc�c";
			next;
		}
		else if('@str$ == "�t���C���̐�") {
			mes "[���Z������]";
			mes "�����A���̐�ł���ˁH";
			mes "�������͕��͋C����������A";
			mes "�ƂĂ��l�C�̏ꏊ�ł���B";
			next;
			mes "[���Z������]";
			mes "���������΁A";
			mes "�J�b�e�B���O�V���G�������";
			mes "�悭�s���Ă�݂����ł��ˁB";
			next;
			mes "[���Z������]";
			mes "�j����l�ōs���̂͒���������A";
			mes "�悭�o���Ă��܂���B";
			next;
			mes "[���Z������]";
			mes "���������΁A�u���[��";
			mes "�悭�s���Ă��Ȃ��c�c";
			next;
			mes "[���Z������]";
			mes "�������񂩍s���Ă݂����ǁA";
			mes "����ς��l����₵���āc�c";
			mes "���������ꏊ�͓�l�ōs���Ȃ���";
			mes "�܂�Ȃ��ł��I";
			next;
		}
		else {
			mes "[���Z������]";
			mes "�͂��H";
			mes "���̂��b�ł����H";
			mes "�Ӗ����悭�킩��܂���B";
			close;
		}
		mes "[���Z������]";
		mes "�t�t�b";
		mes "�܂��A���b���܂��傤�ˁB";
		set RA_3QUE,12;
		close;
	case 22:
	case 23:
	case 24:
		mes "[���Z������]";
		mes "�u���[���A���ė�����c�c";
		mes "���܂����b���������ł��ˁB";
		mes "�����āA�閧�̗��l�̘b��";
		mes "�������ĖႤ����ł��B";
		next;
		mes "[���Z������]";
		mes "�ӂӂ��c�c�y���݂ł��ˁI";
		mes "�����A���ė��ė~�����I";
		close;
	}
}

lhz_in02.gat,213,207,0	script	#�c�荁	111,4,4,{
	end;
OnTouch:
	if(RA_3QUE != 5)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c���̍���́H";
	next;
	mes "-�����������肪����B";
	mes "�@�ԂƂ������c�c�����Ƃ������c�c";
	mes "�@���̊X�ł���ȍ���́A";
	mes "�@��x���k���������Ȃ�-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���̏ꏊ�́c�c";
	mes "����c�c�܂����c�c";
	mes "�ł��A����������Ɓc�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "��x�A���w���ɖ߂���";
	mes "�F�X���ׂ�����������������Ȃ��c�c";
	set RA_3QUE,6;
	close;
}

rachel.gat,265,47,0	script	#�t���C���̐�	111,2,2,{
	end;
OnTouch:
	switch(RA_3QUE) {
	default:
		end;
	case 7:
		mes "-��̋߂��܂ōs���ƁA";
		mes "�@�N�������������Ă���-";
		next;
		mes "[???]";
		mes "�����A��Ȃ����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@�͂��H";
		next;
		mes "[���k����]";
		mes "�z�z�z�c�c";
		mes "�������Ĉ���������ˁB";
		mes "���̕ӂ́A����₷������ˁB";
		mes "���������Ɨ������Ⴄ���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c�I�@�����ł����B";
		mes "���e�؂ɂǂ����B";
		next;
		mes "[���k����]";
		mes "�����ēo��Ȃ���������Ȃ�����";
		mes "�C�����ĂˁB�z�z�z�c�c";
		set RA_3QUE,8;
		close;
	case 8:
		mes "-�������点�Ȃ��悤�ɋC�����悤-";
		close;
	case 22:
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c���B";
		mes "�u���[���񂪁A���������c�c";
		next;
		mes "[���k����]";
		mes "����I�@�����̂��񂽁I";
		mes "�����͊���₷�����炨�������I";
		mes "�N���̌������͕������񂾂�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���k����I";
		mes "���݂܂���I";
		next;
		mes "[���k����]";
		mes "�܂��A�����͐󂢂���";
		mes "�M��鎖�͂Ȃ��Ǝv������ǂˁB";
		mes "�����ǁA���͔G��܂���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�󂢁H";
		mes "���ʂȂ�M��鎖�͂Ȃ���ł����H";
		next;
		mes "[���k����]";
		mes "��������āA�킴�ƓM���Ȃ��";
		mes "���Ȃ��ł������I";
		mes "���̓����Ȃ�����ˁB";
		mes "�t�F�b�t�F�b�t�F�b";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		set RA_3QUE,23;
		close;
	case 23:
		mes "-������������A�u���[�����";
		mes "�@���玀�ɂ������Ă����̂����c�c-";
		next;
		mes "-�����������Ă��Ă��A";
		mes "�@�J�b�e�B���O�V���G������̉ו���";
		mes "�@�Ȃ邾�����Ǝv���āc�c";
		mes "�@����M�ꂽ�̂�������Ȃ��c�c-";
		next;
		mes "�ނׂ̈Ɂc�c���񂷂鎖���Ȃ��A";
		mes "�Ђ����瓦��������ނׂ̈ɁA";
		mes "�����ł��c�c";
		mes "�ו������炵�Ă��������āc�c";
		next;
		mes "��R�����Ȃ��܂܁A";
		mes "�ނ̉ߋ���m��҂���l�ł������A";
		mes "���̐�����������鎖��]��Łc�c";
		next;
		mes "-�Ȃ�ƂȂ������ǁc�c";
		mes "�@���̐򂪎��ɂ��������Ă�C������-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�u���[����I";
		mes "�J�b�e�B���O�V���G������́A";
		mes "���l�ł͂���܂���ł�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ԈႢ�ŔƂ����߂̏d���ɁA";
		mes "���������c�c����̉ʂĂɁc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ߋ��ɐU��񂳂�A";
		mes "���������z�����Ȃ������ׂɁA";
		mes "�S�Ă������������Ă����c�c";
		mes "�����̎ア�l�Ԃ������B";
		set RA_3QUE,24;
		if(checkre()) {
			if(BaseLevel > 90) getexp 130000,0;
			else if(BaseLevel > 75) getexp 85000,0;
			else getexp 45000,0;
		}
		else {
			if(BaseLevel > 90) getexp 1300000,0;
			else if(BaseLevel > 75) getexp 850000,0;
			else getexp 450000,0;
		}
		close;
	}
}

ra_in01.gat,255,25,0	script	�{	111,{
	switch(RA_3QUE) {
	default:
		end;
	case 9:
	case 10:
		mes "-���L�������邯�ǁc�c";
		mes "�@��͂�v���C�o�V�[�͎��Ȃ���-";
		set RA_3QUE,10;
		close;
	case 14:
		mes "-�v���C�o�V�[�Ȃ��";
		mes "�@�l���Ă�ꍇ����Ȃ��I";
		mes "�@����������čs�����I-";
		next;
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B";
		mes " ";
		mes "<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		set RA_3QUE,15;
		getitem 7571,1;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�悵�c�c";
		mes "���̐l�ƌ��������悤�I";
		close;
	case 15:
		mes "-���������ɂ͗p���Ȃ��B";
		mes "�@���̐l�ƌ��������悤�I-";
		close;
	}
}

rachel.gat,266,35,3	script	���k����	918,{
	switch(RA_3QUE) {
	default:
		mes "[���k����]";
		mes "���̐�͌i�F�╵�͋C���悭�āA";
		mes "�{���ɗ����������c�c";
		next;
		mes "[���k����]";
		mes "�Ⴂ���l���񂽂����悭����̂�B";
		mes "�݂�ȁA�����������ꏊ������";
		mes "�����Ƃ킩���Ă���̂ˁB";
		close;
	case 12:
		mes "[���k����]";
		mes "���₨��A���x�͂ǂ������́H";
		mes "�悭����������̂ˁB";
		mes "�ӂӁc�c";
		mes "�������C�ɓ������́H";
		next;
		mes "[���k����]";
		mes "���������΁A";
		mes "�����ɂ悭����j��������̂�c�c";
		next;
		mes "[���k����]";
		mes "������𒭂߂Ă�񂾂��ǁc�c";
		mes "���̎p���c�c";
		mes "�ƂĂ��h�����Ɍ����Ă˂��c�c";
		next;
		mes "[���k����]";
		mes "����Ȃɔ��������ŁA�ǂ�����";
		mes "����Ȑh�����Ȋ�����Ă�̂��c�c";
		next;
		mes "[���k����]";
		mes "��҂Ȃ񂾂���A";
		mes "�����Ɛl�����y���܂Ȃ��Ƃ˂��B";
		next;
		mes "[���k����]";
		mes "���Ȃ����l�����y���݂Ȃ����B";
		mes "�����̖����l���ɂȂ�悤�ɂˁI";
		mes "�c�c�����";
		mes "���݂����ȔN�ɂȂ��Ă��A";
		mes "�K���ȓ��X���߂�������B";
		set RA_3QUE,13;
		close;
	case 13:
		mes "[���k����]";
		mes "���Ȃ����l�����y���݂Ȃ����B";
		mes "�����̖����l���ɂȂ�悤�ɂˁI";
		mes "�c�c�����";
		mes "���݂����ȔN�ɂȂ��Ă��A";
		mes "�K���ȓ��X���߂�������B";
		close;
	case 22:
	case 23:
	case 24:
		mes "[���k����]";
		mes "���̔N�ɂȂ�΁c�c�߂������͑S��";
		mes "�K���Ɏv����́B�ʂɓ��ʂ�";
		mes "�K���Ȏ��Ȃ�āA�����������ǂˁc�c";
		next;
		mes "[���k����]";
		mes "�����c�c�������āA����ȔN�ɂȂ��āA";
		mes "���̒��𒭂߂���̂��������́B";
		mes "���ꂾ�������ӂ��ׂ������Ǝv����́B";
		mes "�N�����΁A���̌��������킩���B";
		close;
	}
}

rachel.gat,196,77,3	script	���N	921,{
	mes "[���N]";
	mes "�u���[�o����́A�D������";
	mes "�������A�Y�킾��I";
	mes "���Ȃ����A�{�N�ɂ��َq��";
	mes "�������񔃂��Ă��ꂽ�񂾁I";
	next;
	mes "[���N]";
	mes "���H";
	mes "�u���[�o����ɉ���������Ȃ��́H";
	mes "�Ӂ[��B�ŋ߁A�������Ȃ����ǁc�c";
	mes "�ǂ������񂾂낤�H";
	next;
	mes "[���N]";
	mes "���`���������āc�c";
	mes "�����Z�ʂ������Ȃ����ǁc�c";
	mes "�܂��A����͂���ł�����ł��I";
	mes "�ււ��I";
	close;
}

rachel.gat,151,155,3	script	���N	921,{
	mes "[���N]";
	mes "�{�N�͑傫���Ȃ�����A�O�����щ��";
	mes "���������l�ɂȂ��!!";
	mes "�������������A�s�v�c�ȏ��́A�S���I";
	mes "�s���Ă݂��!!";
	next;
	mes "[���N]";
	mes "����ŁA�D���ȊX����������A";
	mes "�����ɏZ�ݒ����́I�ւցc�c";
	mes "�{�N�͂������C�ɓ���Ȃ�����A";
	mes "���s���čD���ȊX��������񂾁I";
	next;
	mes "[���N]";
	mes "���������΁A���q�^���[�����ĊX����";
	mes "�z���ė����l������݂�������B";
	mes "���̐l�A���O���������c�c�H";
	mes "�������O�������悤�ȁc�c";
	mes "���[��B�Y�ꂿ������B";
	next;
	mes "[���N]";
	mes "�Ƃɂ����A���̐l�͂�������������";
	mes "����Ȃ����ǁA�{�N�͈Ⴄ�́I";
	mes "������A�������l�ɂȂ肽��!!";
	close;
}

//============================================================
// �������q���N�G�X�g
//- Registry -------------------------------------------------
// RA_4QUE -> 0�`13
//------------------------------------------------------------
ra_in01.gat,384,246,3	script	�r���Z���g	47,{
	if(BaseLevel < 60) {
		mes "[�r���Z���g]";
		mes "�����́A�W�F�h�l�̂����~�ł��B";
		mes "�m���ɍ��A���l�����Ă��܂����c�c";
		next;
		mes "[�r���Z���g]";
		mes "�c�c���Ȃ���";
		mes "�����̎d���́A�����Ȃ��悤�ł��ˁB";
		mes "�\���󂠂�܂��񂪁c�c";
		close;
	}
	switch(RA_4QUE) {
	case 0:
		mes "[�r���Z���g]";
		mes "�����́A�A���i�x���c�̍ō����͎ҁA";
		mes "��_���W�F�h�l�̂����~�ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�����āA���͂��̉��~�̎����A";
		mes "�r���Z���g�Ɛ\���܂��B";
		mes "�U�ߗl�́A�厖�ȉ�ׂ̈�";
		mes "���΂炭����ɂ��Ă����܂��B";
		next;
		mes "[�r���Z���g]";
		mes "���Ȃ��́A";
		mes "���l�̂悤�ł��ˁB";
		next;
		mes "[�r���Z���g]";
		mes "�c�c�c�c";
		mes "���́c�c�U�ߗl������̊Ԃ�";
		mes "�����肪�N���Ă��܂��āc�c";
		mes "���ɍ����Ă���̂ł��B";
		next;
		mes "[�r���Z���g]";
		mes "������낵����΁A";
		mes "���͂�݂��Ē����܂��񂩁H";
		mes "������񂨗���������܂��B";
		mes "�c�c�ǂ��ł��傤���H";
		next;
		if(select("����܂��c�c","�����ł���")==1) {
			mes "[�r���Z���g]";
			mes "�c�c�����ł����B";
			mes "�c�O�ł����A�d������܂���ˁB";
			close;
		}
		mes "[�r���Z���g]";
		mes "�����I�@�{���ł���!?";
		mes "������܂��I";
		next;
		mes "[�r���Z���g]";
		mes "�ł́A���������c�c";
		mes "���Ȃ��ɂ��Ē�����������";
		mes "���T���ł���A";
		mes "�����ɐl�T���ł�����܂��B";
		next;
		mes "[�r���Z���g]";
		mes "�ڂ������b���܂��Ɓc�c";
		mes "�U�ߗl�����c�l���炨�a����ɂȂ���";
		mes "�R����������΂�";
		mes "�����Ă��܂����̂ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�Ɛl�͋��炭�c�c";
		mes "��΂��������Ɠ�����";
		mes "�p�������Ȃ��Ȃ���";
		mes "�g�p�l�̃t�H�r�G���Ǝv���̂ł����c�c";
		next;
		mes "[�r���Z���g]";
		mes "���Ȃ��ɂ�";
		mes "�t�H�r�G��T���o���Ă��炢�A";
		mes "���܂ꂽ��΂����߂���";
		mes "�~�����̂ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�o����΁A�U�ߗl��";
		mes "���̌��������m�ɂȂ�O�Ɂc�c";
		next;
		mes "[�r���Z���g]";
		mes "��΂����܂ꂽ����";
		mes "���ꂮ��������ɂ��Ă��������B";
		mes "�\�����ɂȂ�΁A���Ƃ̒p�I";
		mes "���΂��̎�ɂȂ��Ă��܂��܂��I";
		next;
		mes "[�r���Z���g]";
		mes "�t�H�r�G�̎��Ȃ�A";
		mes "���̉��~�œ����Ă���";
		mes "���̎g�p�l�ɕ�����";
		mes "�F�X�킩��͂��ł��B";
		mes "�ł́A��낵�����肢���܂��B";
		set RA_4QUE,1;
		close;
	case 1:
	case 2:
	case 3:
		mes "[�r���Z���g]";
		mes "���̎g�p�l��������A";
		mes "�t�H�r�G�ɂ��ĐF�X��";
		mes "�����Ă݂�Ƃ����ł��傤�B";
		close;
	case 4:
	case 5:
	case 6:
		mes "[�r���Z���g]";
		mes "�t�H�r�G��T���o���āA";
		mes "��΂����߂��Ă��������B";
		mes "���肢�������܂��B";
		close;
	case 7:
		mes "[�r���Z���g]";
		mes "�c�c�n�b�I";
		mes "�ǁA�ǂ����āc�c�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����Đ����Ă��邩���āH";
		mes "�{���������̂ł��ˁc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ÎE�҂Ɏ����n������悤";
		mes "�˗������̂́c�c";
		mes "���Ȃ��Ȃ�ł��ˁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̂ł��H";
		mes "��́A����!!";
		mes "�t�H�r�G�́A���҂Ȃ�ł����I";
		mes "�ǂ����Ď����E�����Ƃ���̂ł���!?";
		next;
		mes "-���h���B���؂�Ȃ��r���Z���g�́A";
		mes "�@�k�����Ŏ��𒍂��A";
		mes "�@��C�Ɉ��݊�����-";
		next;
		mes "[�r���Z���g]";
		mes "�c�c���c�c�����ł��傤�B";
		mes "�����Ȃ����ȏ�A�S�đł������܂��I";
		mes "�t�H�r�G�́c�c";
		mes "�t�H�r�G�́A���̑��q�ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�H";
		next;
		mes "[�r���Z���g]";
		mes "���Ɓc�c";
		mes "��t�̃W�F�j�[�Ƃ̊Ԃɏo����";
		mes "�q���Ȃ�ł��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c����ŁH";
		mes "����Ǝ����E�����Ƃ������́A";
		mes "�֌W�Ȃ��ł��傤�H";
		next;
		mes "[�r���Z���g]";
		mes "��͂�c�c";
		mes "�O�̐l�ɂ͗����ł��܂��񂩁c�c";
		next;
		mes "[�r���Z���g]";
		mes "�A���i�x���c�c�c";
		mes "���ɂ����A���w����";
		mes "�l�X�Ȑl��Ǝ푰�������A";
		mes "���藧���Ă��錾��΋��a���ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�������A���������݂��ڏZ�̖���";
		mes "�g������邾����������Z���Ƃ̊֌W��";
		mes "�����ł͂Ȃ��̂������Ȃ̂ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c";
		next;
		mes "[�r���Z���g]";
		mes "�����́A�b�������Ă��܂������H";
		next;
		mes "[�r���Z���g]";
		mes "�W�F�j�[�͗D�����ĉ��������ł���";
		mes "��Z���B";
		next;
		mes "[�r���Z���g]";
		mes "�c�������玄����āc�c";
		mes "���܂Ŗʓ|�����Ă��ꂽ�U�ߗl�Ɂc�c";
		next;
		mes "[�r���Z���g]";
		mes "��Z���Ƃ̈��⌋���ŁA�U�ߗl�̖��_��";
		mes "�����鎖�͂ł��Ȃ������̂ł��I";
		next;
		mes "[�r���Z���g]";
		mes "�������A";
		mes "�l�̋C�����͎v���ʂ�ɂ͂����Ȃ��c�c";
		next;
		mes "[�r���Z���g]";
		mes "�������͔閧���Ɍ������c�c";
		mes "�����āA�q�����ł����c�c";
		next;
		mes "[�r���Z���g]";
		mes "���ꂪ�t�H�r�G�Ȃ̂ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�����c�c";
		mes "���͂Ȃ�Ď������Ă��܂����̂��c�c";
		next;
		mes "[�r���Z���g]";
		mes "���̖��́A�U�ߗl�̕��B";
		mes "��������ɏo������̂���Ȃ��B";
		next;
		mes "[�r���Z���g]";
		mes "���ƃW�F�j�[�c�c";
		mes "�t�H�r�G�̊֌W�͒N�ɂ������Ȃ��c�c";
		mes "�c�c�閧�c�c";
		next;
		mes "[�r���Z���g]";
		mes "���̔閧�𕨐S�������t�H�r�G��";
		mes "�m���Ă��܂��c�c";
		mes "�����āA�����̏o�������݂܂����B";
		next;
		mes "[�r���Z���g]";
		mes "�W�F�j�[���c�c";
		mes "�����āA�S�Ă̌����ł��邱�̎���";
		mes "����ł���̂ł��傤�c�c";
		next;
		mes "[�r���Z���g]";
		mes "��΂𓐂񂾂̂́A";
		mes "�t�H�r�G�ł��ł��鎄�ւ̕��Q�c�c";
		next;
		mes "[�r���Z���g]";
		mes "�t�H�r�G����΂𓐂�œ��������A";
		mes "������ʐU������Ă��܂������c�c";
		mes "���̐S�́A�ƂĂ��ꂵ�������c�c";
		next;
		mes "[�r���Z���g]";
		mes "�c�c�ӂӁc�c";
		mes "���ɂ��e�S�͂������悤�ł��c�c";
		next;
		mes "[�r���Z���g]";
		mes "�ł����A�t�H�r�G�����~���o����A";
		mes "�ǂ��֍s���Ă��܂�����";
		mes "���ɂ��킩��܂���ł����B";
		next;
		mes "[�r���Z���g]";
		mes "�U�ߗl�̗��璆��";
		mes "�t�H�r�G�ƕ�΂��߂��";
		mes "�悩�����̂ł����c�c";
		mes "�U�ߗl���A���낻�뉮�~��";
		mes "�߂��鍠�ł��傤�c�c";
		next;
		mes "[�r���Z���g]";
		mes "�c�c������c�c";
		mes "������A�t�H�r�G�ł͂Ȃ��Ɛl��";
		mes "�K�v�������̂ł��I";
		mes "��΂𓐂񂾐Ԃ̑��l��";
		mes "����ł����΁I";
		next;
		mes "[�r���Z���g]";
		mes "�ŏ��ɂ��Ȃ����ق����̂�";
		mes "�Ɛl�c�c�t�H�r�G��T���ׂł����B";
		mes "�ł����c�c���Ԃ��������A";
		mes "���Ȃ��ɂ͕�΂𓐂񂾔Ɛl�Ƃ���";
		mes "����ł��炨���Ǝv�����̂ł��I";
		next;
		mes "[�r���Z���g]";
		mes "�c�c���c�c�͂́c�c�͂͂́I";
		mes "�Ȃ�����Ȏ����v�������̂��c�c";
		mes "���������͂��ꂪ�őP�ƍl��";
		mes "���̋^��������܂���ł����I";
		mes "�͂́c�c���͂ǂ������Ă����c�c";
		next;
		mes "-�c�c�ǂ����A�r���Z���g�����";
		mes "�@�t�H�r�G�̎����ƂĂ��厖��";
		mes "�@�v���Ă���悤��-";
		next;
		mes "[�r���Z���g]";
		mes "�c�c�{���Ɂc�c";
		mes "�{���ɐ\���󂠂�܂���ł����c�c";
		next;
		mes "[�r���Z���g]";
		mes "�ł����A�����Ȃ����ȏ�c�c";
		mes "��̑ł��l���Ȃ��c�c";
		next;
		mes "[�r���Z���g]";
		mes "�c�c���͐ӔC��������ł����A";
		mes "�������ŐӔC������悤�ȊȒP��";
		mes "���ł͂Ȃ��̂ł��c�c";
		next;
		mes "[�r���Z���g]";
		mes "�t�H�r�G�������ē�������΂�";
		mes "���̕ӂ̕�΂Ƃ͖󂪈Ⴄ�c�c";
		next;
		mes "[�r���Z���g]";
		mes "���̃A���i�x���c�������A";
		mes "���n�Ɋׂ������A�g���悤�ɂ�";
		mes "�U�ߗl���A���c�l���璼�ڎ�����";
		mes "�~���̗͂�����΂Ȃ̂ł��B";
		next;
		mes "[�r���Z���g]";
		mes "����ȑ厖�ȕ���������";
		mes "������Ȃ�āc�c�N�b�c�c";
		next;
		mes "[�r���Z���g]";
		mes "�c�c�\����Ȃ����A���̌��ɂ�";
		mes "�����ւ��Ȃ��ł��������B";
		mes "����A���Ȃ��ɂ͖񑩂�����V��";
		mes "�{�̋��z�����͂����܂��c�c";
		mes "�ǂ��������Ă��������c�c";
		next;
		mes "[�r���Z���g]";
		mes "�{���ɐ\���󂠂�܂���B";
		mes "�c�c����������肭�������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���[��B";
		mes "�\���o�͂��肪�����̂ł����A";
		mes "���̕�V�͒����܂���B";
		mes "���́A�܂��������Ă��܂��񂵁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ��͎����E������";
		mes "�ÎE�҂��ق��܂������A";
		mes "����Ȏ��͂ǂ��ł������ł��B";
		mes "���̕ӂ̃����X�^�[�̕���";
		mes "����ۂǊ댯�ł����ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ƃ��ẮA�d���������󂯂��ȏ�A";
		mes "�Ō�܂ŃL�`���ƏI��点�Ȃ���";
		mes "�C�����������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�C�����悭��V��Ⴄ�ׂɂ��A";
		mes "������x�t�H�r�G��T���Ă݂܂���B";
		next;
		mes "[�r���Z���g]";
		mes "�c�c�ȁc�c�فA�{���ł���!?";
		mes "�c�c�N�b�c�c";
		mes "���ӂ̌��t���������܂���c�c";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "-���[���c�c";
		mes "�@�i�D����������ȁc�c";
		mes "�@�܁A�Ⴂ���̋�J��";
		mes "�@�����Ăł�������Č�����-";
		next;
		mes "-���āI";
		mes "�@�t�H�r�G��T���ɍs�����I-";
		set RA_4QUE,8;
		close;
	case 8:
		mes "-�t�H�r�G��T���ɍs�����I-";
		close;
	case 9:
		mes "[�r���Z���g]";
		mes "�c�c���I";
		mes "�ǂ��ł����H";
		mes "�t�H�r�G�͌�����܂�����!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ӂ��c�c�����B";
		mes "��΂Ƃ́A����̎��ł��ˁH";
		mes "�ǂ����󂯎���Ă��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�l�T���ɋ������Ⴍ��q���̐��b�B";
		mes "�c�c�{���ɑ�ςł�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��V�͑��߂ɖ��Ȃ���";
		mes "���ɍ���Ȃ��ł��ˁB";
		mes "�n�n�n�B";
		next;
		mes "[�r���Z���g]";
		mes "�{���Ɂc�c";
		mes "�{���ɂ��肪�Ƃ��������܂��c�c";
		next;
		mes "[�r���Z���g]";
		mes "����̎��́A�ꐶ�Y��܂���I";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "-�r���Z���g����̊�ɂ�";
		mes "�@���g�̕\��L�����Ă�B";
		mes "�@��т̗܂��~�܂�Ȃ��l��-";
		next;
		mes "[�r���Z���g]";
		mes "�c�c���A����ŁI";
		mes "�t�H�r�G�͂ǂ��Ɂc�c�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�t�H�r�G�͍��A�t���C���̐�ɂ��܂��B";
		mes "�܂��A�C�����̐������t���Ă��Ȃ�";
		mes "�悤�ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł��A�K���߂�Ɩ񑩂��Ă���܂����B";
		mes "���́A�����Ƃ��Ă����Ă��������B";
		next;
		mes "[�r���Z���g]";
		mes "�����ł����c�c";
		mes "�����Ȃ�悩�����c�c";
		mes "�{���ɂ悩�����c�c";
		next;
		mes "[�r���Z���g]";
		mes "�����W�F�j�[�ɂ��m�点�Ȃ��ƁI";
		mes "�����ƁA�S�z���Ă��܂�������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����������`���Ă��܂���B";
		mes "�S�z���Ȃ��ł��������B";
		next;
		mes "[�r���Z���g]";
		mes "���݂܂���A������܂��B";
		mes "�ł́A���肢�������܂��B";
		next;
		mes "-�W�F�j�[����Ƀt�H�r�G�̎���";
		mes "�@�b���ɍs����-";
		set RA_4QUE,10;
		close;
	case 10:
		mes "-�W�F�j�[����Ƀt�H�r�G�̎���";
		mes "�@�b���ɍs����-";
		close;
	case 11:
		mes "[" +strcharinfo(0)+ "]";
		mes "�W�F�j�[�����";
		mes "�t�H�r�G�̎��́A�b���Ă����܂����B";
		next;
		mes "[�r���Z���g]";
		mes "�����ł����c�c";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�r���Z���g]";
		mes "�ޏ��ɂ́A�{���Ɉ����������܂����B";
		mes "���̂悤�ȋ����Ȓj�ɏo������ׂ�";
		mes "�ޏ������������Ă��܂����c�c";
		next;
		mes "[�r���Z���g]";
		mes "���Ȃ��ɉ�āc�c�{���ɂ悩�����B";
		mes "���Ȃ����A�����c�c";
		mes "�������Ƒ��������Ă��ꂽ�B";
		next;
		mes "[�r���Z���g]";
		mes "�܂��A���w���ɂ��鎞�́A";
		mes "�K�����̏��Ɋ���Ă��������B";
		mes "���ɏo���鎖������΁A";
		mes "�����낤�ƕK���͂ɂȂ�܂��B";
		next;
		mes "[�r���Z���g]";
		mes "�Ō�ɂ���1���肢������܂��B";
		mes "���̎莆�ƕ�΂�_�a�ɂ���U�ߗl�c�c";
		mes "�W�F�h��_���ɓn���Ē����܂��񂩁H";
		mes "������ƌ����΁A���͂��ł��B";
		next;
		mes "[�r���Z���g]";
		mes "�����āA���ꂪ������̎ӗ�ł��B";
		mes "�ǂ����󂯎���Ă��������B";
		next;
		mes "-�r���Z���g���񂩂�";
		mes "�@��V�ƕ�΂��񂾏���A";
		mes "�@�����āA�莆���󂯎����-";
		set RA_4QUE,12;
		getitem 617,1;
		next;
		mes "[�r���Z���g]";
		mes "�ꏏ�ɂ��n�����莆�́A";
		mes "�U�ߗl�ւ̏Љ��ł��B";
		mes "���Ȃ��Ȃ�A�����ƒU�ߗl��";
		mes "�C�ɓ����Ă�������ł��傤�B";
		next;
		mes "[�r���Z���g]";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		next;
		mes "-�_�a�ɂ���W�F�h��_����";
		mes "�@��������ɂ�����-";
		close;
	default:
		mes "[�r���Z���g]";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		mes "����������������A";
		mes "���ł������ɗ��Ă��������B";
		mes "���x�͎������Ȃ������������܂��B";
		close;
	}
}

rachel.gat,114,232,3	script	���[�K��	869,{
	switch(RA_4QUE) {
	default:
		mes "[���[�K��]";
		mes "���́A�W�F�h�l�̂����~�œ����Ă���";
		mes "���[�K�����B";
		next;
		mes "[���[�K��]";
		mes "�Z�����񂾂���A�ז����Ȃ��ł���B";
		close;
	case 1:
		mes "[" +strcharinfo(0)+ "]";
		mes "����ɂ��́B";
		mes "�����œ����Ă���";
		mes "�t�H�r�G�Ƃ����l��m���Ă��܂����H";
		next;
		mes "[���[�K��]";
		mes "����H";
		mes "���O�A�N���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ɓc�c";
		mes "���͐l�T���ׂ̈Ɍق�ꂽ�҂ł����c�c";
		next;
		mes "[���[�K��]";
		mes "�����A�������������I";
		mes "�����ƎႢ�z���ȁ`";
		mes "�t�H�r�G�̎����ȁH";
		next;
		mes "[���[�K��]";
		mes "�O���O�A�s��ɔ������ɍs���ƌ�����";
		mes "�o�čs�����̂͊o���Ă邯�ǂȁc�c";
		mes "���ꂩ��߂��Ă��ĂȂ��݂������B";
		next;
		mes "[���[�K��]";
		mes "�܂��q��������S�z���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���H";
		mes "�t�H�r�G�͂����Ȃ�ł����H";
		next;
		mes "[���[�K��]";
		mes "���[�A���[��c�c";
		mes "�m���c�c15�Έʂ��������ȁH";
		next;
		mes "[���[�K��]";
		mes "���͉��������œ����������΂���łˁB";
		mes "����Ȃɏڂ����͒m��Ȃ��񂾁B";
		next;
		mes "[���[�K��]";
		mes "���ɕ������A";
		mes "�����ƒ��������Ă��鑼�̘A����";
		mes "���������������񂶂�Ȃ����H";
		next;
		mes "[���[�K��]";
		mes "�������ȁB";
		mes "���~�̒��œ����Ă���";
		mes "�}���\������ɂł�";
		mes "�����Ă݂���ǂ����H";
		set RA_4QUE,2;
		close;
	case 2:
		mes "-���~�̒��ɂ���}���\���Ƃ����l��";
		mes "�@�b�𕷂��Ă݂悤-";
		close;
	}
}

ra_in01.gat,372,200,3	script	�}���\��	929,{
	switch(RA_4QUE) {
	case 0:
		mes "[�}���\��]";
		mes "���V�́A�W�F�h�l�̂����~��";
		mes "�����}���\�����B";
		mes "�����I�@���~�������񂶂�Ȃ��I";
		close;
	case 1:
		mes "[�}���\��]";
		mes "�����A�A���i�x���c��";
		mes "�����̐l�킪������Ă��鍑�����A";
		mes "���V�̂悤�Ȑ�Z���ł��W�F�h�l��";
		mes "�����~�œ�����B";
		next;
		mes "[�}���\��]";
		mes "���ꂾ���ł��A�������Ȃ��Ɓc�c";
		mes "�ƂĂ����肪�������Ȃ񂾁B";
		close;
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c����ɂ��́B";
		mes "�t�H�r�G�Ƃ����l�̎���";
		mes "���������̂ł����B";
		next;
		mes "[�}���\��]";
		mes "��H";
		mes "���O�́A�ǂ��̒N���H";
		mes "�ǂ����ăt�H�r�G�̎��𕷂��񂾁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ɓc�c";
		mes "���́A�l�T���ׂ̈�";
		mes "�ق�ꂽ�҂ł����c�c";
		next;
		mes "[�}���\��]";
		mes "�����I�@�������������B";
		mes "����������Ƃ��Ƃ��䖝�̌��E���H";
		mes "�܂��c�c";
		mes "�呛���ɂȂ�Ȃ��Ⴂ���񂾂��c�c";
		mes "�����ʁA�V�т����N�����낤���c�c";
		next;
		mes "[�}���\��]";
		mes "�O���O�A������";
		mes "���V���������𗊂񂾂񂾁B";
		mes "����܂�ɁA�ɂƌ�������";
		mes "�����o���ɍs���ė����ƂȁB";
		next;
		mes "[�}���\��]";
		mes "���񂾕i��������";
		mes "�債�����Ȃ����c�c";
		mes "�܂����A����Ȏ��ɂȂ�Ƃ�";
		mes "�v���Ă����Ȃ�������B";
		next;
		mes "[�}���\��]";
		mes "�A���ė�����A";
		mes "���������Ă���ƂȁB";
		next;
		mes "[�}���\��]";
		mes "���I�@�������B";
		mes "�����͒�t�̃W�F�j�[����";
		mes "�A��Ă����q���B";
		next;
		mes "[�}���\��]";
		mes "�W�F�j�[����́A";
		mes "���̉��~�Œ��������Ă��邵�A";
		mes "�q���D�����B";
		mes "�t�H�r�G�́A��������������������";
		mes "�����ɘA��ė��Ă������񂾂낤�ȁB";
		next;
		mes "[�}���\��]";
		mes "�����c�c����Ȃ��������~��";
		mes "�������ĖႦ�Ă��邠�肪���݂�";
		mes "�܂��킩������Ȃ��悤���ȁc�c";
		mes "�����A�C�^�Y���΂��肵�����āc�c";
		next;
		mes "[�}���\��]";
		mes "���̉��~�Ŏd��������ׂɂ�";
		mes "����Ȃ�̏���������̂����A";
		mes "�W�F�j�[���񂪘A��ė����q�����A";
		mes "���ʂɎd���������Ă�̂��B";
		next;
		mes "[�}���\��]";
		mes "���̋C����������񂪁A";
		mes "�t�H�r�G�ׂ̈ɂ��񂽂��ق����̂�";
		mes "�����������ˁB";
		mes "�ǂ����āA�����܂ō\���̂��낤�H";
		next;
		mes "[�}���\��]";
		mes "���������΁A";
		mes "������������񂪂킴�킴";
		mes "���V�Ƀt�H�r�G�̎��𕷂��Ă����񂾁B";
		next;
		mes "[�}���\��]";
		mes "�o���������̕������ǂ����������Ƃ��A";
		mes "�܂��c�c����Ȏ��𕷂��Ă��ȁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ł����B";
		next;
		mes "[�}���\��]";
		mes "�܂��A�ڂ������̓W�F�j�[�����";
		mes "�����Ă݂�Ƃ����B";
		mes "�t�H�r�G�̎���";
		mes "��Ԃ悭�m���Ă���͂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ŁA���̃W�F�j�[�����";
		mes "�ǂ��ɁH";
		next;
		mes "[�}���\��]";
		mes "�W�F�j�[����Ȃ�A";
		mes "�����뉀�Ŏd�������Ă����B";
		next;
		mes "-�뉀�ɂ���W�F�j�[�Ƃ����l��";
		mes "�b�𕷂��Ă݂悤-";
		set RA_4QUE,3;
		close;
	case 3:
		mes "-�뉀�ɂ���W�F�j�[�Ƃ����l��";
		mes "�b�𕷂��Ă݂悤-";
		close;
	default:
		mes "[�}���\��]";
		mes "�����A�Z�����Z�����B";
		mes "�{���ɖZ�����[�I";
		close;
	}
}

rachel.gat,48,236,3	script	�W�F�j�[	894,{
	switch(RA_4QUE) {
	case 0:
	case 1:
	case 2:
		mes "[�W�F�j�[]";
		mes "�����́A�W�F�h�l�̏��L�n�ł��B";
		mes "����ɓ����Ă͍���܂��B";
		close;
	case 3:
		mes "[" +strcharinfo(0)+ "]";
		mes "����ɂ��́B";
		mes "�W�F�j�[����ł��ˁH";
		next;
		mes "[�W�F�j�[]";
		mes "�����c�c�����ł����c�c";
		mes "���Ȃ��́c�c�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́A�t�H�r�G�Ƃ����l��T���ׂ�";
		mes "�ق�ꂽ�҂ł��B";
		next;
		mes "[�W�F�j�[]";
		mes "���I";
		mes "�����Ȃ�ł����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�t�H�r�G�̎�����Ԃ悭�m���Ă����";
		mes "���������̂Łc�c";
		mes "���̎q���������ȏꏊ��A";
		mes "�悭�s�����������ė~�����̂ł����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́A���̎҂Ȃ̂�";
		mes "���̕ӂ̎��͂悭�킩��܂���B";
		mes "�����ĖႦ��Ə�����܂��B";
		next;
		mes "[�W�F�j�[]";
		mes "�c�c���̎q�́A�{���ɂ����q�ł��B";
		mes "�ǂ�Ȉ����������̂��m��܂��񂪁A";
		mes "�����q�ł͂���܂���c�c��΂Ɂc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����B";
		mes "�����q���Ȃ�Ďv���Ă��܂����B";
		mes "�����c�c�A���ė��Ȃ��̂Łc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����S�z�����r���Z���g���񂪁A";
		mes "���Ƀt�H�r�G��T���悤���񂾂̂ł��B";
		next;
		mes "[�W�F�j�[]";
		mes "�����ł����I";
		mes "�������񂪁c�c���̂悤�Ȏ����c�c";
		mes "�ǂ����t�H�r�G�̎��A";
		mes "��낵�����肢���܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��A�S�͂�s�����܂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����Łc�c";
		mes "�悭�s���ꏊ�Ƃ��A";
		mes "�S������͂���܂��񂩁H";
		next;
		mes "[�W�F�j�[]";
		mes "���ꂪ�c�c";
		mes "�킩��܂���c�c";
		mes "�������t���܂���c�c";
		next;
		mes "-�W�F�j�[�����";
		mes "�@���������̖����l�q�ŁA";
		mes "�@�ƂĂ��ْ����Ă���l�Ɍ�����-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�킩��܂����B";
		mes "�ł́A���𓖂����Ă݂܂��B";
		next;
		mes "[�W�F�j�[]";
		mes "���I�@�t�H�r�G�͓���";
		mes "�o���_�i�����Ă���̂�";
		mes "�N���o���Ă��邩������܂���B";
		mes "�ǂ����A�t�H�r�G��";
		mes "��낵�����肢���܂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��c�c";
		mes "�킩��܂����B";
		mes "���܂�S�z���Ȃ��ł��������B";
		next;
		mes "-�܂��́A�}���\������";
		mes "�@�O���O�ɂ��g���ōs�������Ƃ���";
		mes "�@�s��ɍs���Ă݂悤-";
		set RA_4QUE,4;
		close;
	case 4:
		mes "-�܂��́A�}���\������";
		mes "�@�O���O�ɂ��g���ōs�������Ƃ���";
		mes "�@�s��ɍs���Ă݂悤-";
		close;
	case 5:
	case 6:
		mes "[�W�F�j�[]";
		mes "���́c�c�t�H�r�G���c�c";
		mes "�t�H�r�G����낵�����肢���܂��I";
		mes "�K���T���o���Ă��������I";
		close;
	case 7:
		mes "-�b���������͎R�قǂ��邪�A";
		mes "�@�܂��̓r���Z���g����̏��ɍs����-";
		close;
	case 8:
		mes "-�t�H�r�G��T���̂��悾�I";
		mes "�@�ڂ����b�͌�ɂ��悤-";
		close;
	case 9:
		mes "-�܂��̓r���Z���g�����";
		mes "�@��΂ƃt�H�r�G�̎���m�点�悤-";
		close;
	case 10:
		mes "[�W�F�j�[]";
		mes "�ǂ��ł�����!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�t�H�r�G�́A�����܂����B";
		mes "��l�Ńt���C���̐�ɂ��܂�����B";
		next;
		mes "[�W�F�j�[]";
		mes "�c�c�{���ɂ悩�����I";
		mes "���̎q�ɉ�����������ƁA";
		mes "�C���C�ł͂Ȃ������̂ł��B";
		next;
		mes "[�W�F�j�[]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		next;
		mes "[�W�F�j�[]";
		mes "���ꂾ�������b�ɂȂ����̂Ɂc�c";
		mes "���̂�����o���Ȃ��āc�c";
		mes "�{���ɐ\���󂠂�܂���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����A�C�ɂ��Ȃ��ł��������B";
		mes "���̑���A���ꂩ���";
		mes "�Ƒ��݂�ȂōK���ɂȂ��Ă��������ˁB";
		next;
		mes "[�W�F�j�[]";
		mes "�c�c�������ł������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�r���Z���g���񂩂�b�͕����܂����B";
		mes "���ꂩ��́A�݂�ȂōK���ɕ�点���";
		mes "�����ł��ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�t�H�r�G�����̂����A";
		mes "�r���Z���g����̋C������";
		mes "�킩���Ă����Ǝv���܂���B";
		next;
		mes "[�W�F�j�[]";
		mes "�����ł��ˁc�c";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������B";
		mes "���́A�����̎d�������������ł��B";
		mes "�ł́A���K���Ɂc�c";
		next;
		mes "[�W�F�j�[]";
		mes "���肪�Ƃ��������܂����B";
		mes "���Ȃ��������K���ł�����悤";
		mes "�F���Ă܂��B";
		set RA_4QUE,11;
		close;
	default:
		mes "[�W�F�j�[]";
		mes "�t�H�r�G��T���o���Ă���āA";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���ɏo���鎖����������A";
		mes "���ł������Ă��������B";
		close;
	}
}

rachel.gat,138,73,3	script	�ɂ����Ȏs��̏��l	85,{
	switch(RA_4QUE) {
	default:
		mes "[�ɂȎs��̏��l]";
		mes "�����B";
		mes "�����͂��ĂȂ��ȁB";
		mes "���q�����Ȃ����c�c";
		mes "�����͂����X�d�����ɂ��邩�I";
		close;
	case 4:
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "���݂܂���B";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "�ց`���A��������Ⴂ�I";
		mes "���q����I�@���������߂ł����H";
		mes "�������ȊO�͑S�������Ă܂���`�I";
		mes "�ւ��ւ��ւ��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����B";
		mes "�������ɗ����󂶂�Ȃ��āc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�O�����O�A���̓X�ɔ������ɗ���";
		mes "���Ƀo���_�i���������j�̎q��";
		mes "�o���Ă��܂��񂩁H";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "�͂��H";
		mes "���q���񂶂�Ȃ��̂���`";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "�o���_�i�̒j�̎q���c�c";
		mes "���ꂾ������Ȃ��c�c";
		mes "�����ɗ���z�͂����ς����邩��ȁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "15�Έʂ̒j�̎q�Ȃ�ł����c�c";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "���̑��q������15�΂���I";
		mes "���̔N���̎q�Ȃ�Ă����ς�����B";
		mes "�Ƃɂ����A���͊o���ĂȂ�����";
		mes "���̓z�ɕ����Ă݂ȁI";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "�����A�ق�ق�I";
		mes "�����C���Ȃ��Ȃ�A";
		mes "�������Ƒ����ɍs���ȁI";
		next;
		mes "[�ɂȎs��̏��l]";
		mes "�V�b�V�b�I";
		mes "�����T���ꂽ���̂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�́c�c�͂��B";
		mes "���炵�܂��B";
		set RA_4QUE,5;
		close;
	case 5:
		mes "-���̏��l����t�H�r�G�̏���";
		mes "�@�����Ȃ������B";
		mes "�@���̏��l�ɕ����Ă݂悤-";
		close;
	}
}

rachel.gat,120,47,3	script	�ދ������Ȏs��̏��l	85,{
	switch(RA_4QUE) {
	default:
		mes "[�ދ������Ȏs��̏��l]";
		mes "���[���A�N�����˂��Ȃ��I";
		mes "���ꂶ�Ꮴ���オ�����肾��I";
		mes "�]�E�ł��l���邩�c�c�H";
		close;
	case 5:
		mes "[" +strcharinfo(0)+ "]";
		mes "���݂܂��[��B";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "��������Ⴂ�I�@��������Ⴂ�I";
		mes "�������T���ł��傤���H";
		mes "�����[�I�@�������������܂��`�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c���́c�c";
		mes "�l��T���Ă����ł����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�O�����O�A�����ɔ������ɗ���";
		mes "���Ƀo���_�i���������j�̎q��";
		mes "�o���Ă��܂����H";
		next;
		mes "-�����������u�ԁA";
		mes "�@�������B���Ȃ��\��ŏ��l��";
		mes "�@���������ƌ��߂�-";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "���񂽂��ȁc�c";
		mes "�ԈႢ�Ȃ��c�c";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "��ӁA�q����{���Ă���l��������";
		mes "�`���Ă���Ɠ`���𗊂܂�Ăˁc�c";
		mes "�X�̓��A�܂ŗ������Ă��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����!?�@�N����`�����H";
		mes "�ǂ����āA���������ɗ��鎖��";
		mes "�킩�����񂾂낤�c�c";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "�m�邩��B";
		mes "���́A�����`���𗊂܂ꂽ�������B";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "���O�͉������������ȁc�c";
		mes "���[�K���H�@���[�S���H";
		mes "����Ȗ��O�������C������Ȃ��B";
		mes "�r���ۂ����͋C�̒j��������B";
		next;
		mes "[�ދ������Ȏs��̏��l]";
		mes "�Ƃɂ����A���͂���ȏ�m��˂��I";
		mes "��������Ȃ��Ȃ�A";
		mes "�������ƁA�ǂ����s���Ă���I";
		next;
		mes "-�c�c�ǂ����������낤�c�c";
		mes "�@����������������c�c";
		mes "�@�Ƃɂ����A�X�̓��A�ɍs���Ă݂悤-";
		set RA_4QUE,6;
		close;
	case 6:
		mes "-���������֗���ƒm������ŁA";
		mes "�@�N�����`�����c�����c�c-";
		next;
		mes "-�������������ǁc�c";
		mes "�@�X�̓��A�ɍs���Ă݂悤-";
		close;
	}
}

ra_fild01.gat,245,325,3	script	�������j	934,{
	switch(RA_4QUE) {
	default:
		mes "[�������j]";
		mes "�������c�c";
		mes "��H�@�Ȃ񂾁H";
		mes "�������֍s���I";
		close;
	case 6:
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ȃ������[�K������ł����H";
		next;
		mes "[�������j]";
		mes "�C�q�q�`�I";
		mes "�{���ɗ��₪�����I";
		mes "����͊y�����ȁc�c";
		next;
		mes "[�������j]";
		mes "����ł����炢�₪��!!";
		percentheal -50,0;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ȁA��������񂾁I";
		mes "�����Ȃ�I";
		next;
		mes "-���ŗ���Z��������A";
		mes "�@�����U�������������I-";
		next;
		mes "-���̈ꌂ�ŁA�j�͓|�ꂽ-";
		next;
		mes "[�������j]";
		mes "�c�c�N�b�c�c";
		mes "�����҂���Ȃ��ȁc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ȃ�U�����Ă���Ȃ�āc�c";
		mes "��́A���Ȃ��͉��Ȃ񂾁I";
		mes "�t�H�r�G�͂ǂ��ɂ���I";
		next;
		mes "[�������j]";
		mes "�t�H�r�G�H�@���̎����H";
		mes "����ȓz�A�m��˂���B";
		next;
		mes "[�������j]";
		mes "���͂����A���O���E����";
		mes "���̂�n���悤�ɗ��܂ꂽ";
		mes "�E��������c�c";
		next;
		mes "[�������j]";
		mes "�y�Ȏd�����Ǝv�����̂Ɂc�c";
		mes "�������傤�c�c";
		mes "�ʖڊےׂꂾ�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�E���悤�ɗ��܂ꂽ�H";
		mes "��́A�N�ɗ��܂ꂽ�񂾁I";
		mes "����ɁA�t�H�r�G�͂ǂ����I";
		next;
		mes "[�������j]";
		mes "������A�t�H�r�G�Ȃ�Ēm��˂���c�c";
		mes "���́A�r���Z���g���ēz�ɗ��܂��";
		mes "���O���E���Ď��̂������Ă����";
		mes "����𕥂����Č���ꂽ�񂾁B";
		next;
		mes "[�������j]";
		mes "���E��E���E��I";
		mes "���̖��O�̓��[�K������Ȃ��āA";
		mes "���[�K����!!";
		mes "���̏��l�A���O���o�����˂��̂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "!!!!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����āc�c";
		mes "�r���Z���g���񂪁c�c";
		next;
		mes "[���[�K��]";
		mes "����H";
		mes "�c�c�C�q�q�q�q�I�@����͌��삾�I";
		mes "���O���r���Z���g�ɉ������܂ꂽ�̂��H";
		mes "���𗊂܂ꂽ���m��񂪁A";
		mes "���݂��Г�ȁB";
		next;
		mes "[���[�K��]";
		mes "�͂��c�c";
		mes "�������������蕉�����܂��Ƃ́c�c";
		mes "���ꂶ������Ⴆ�˂��c�c�������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c";
		next;
		mes "[���[�K��]";
		mes "�ǂ����A���݂�";
		mes "�����˗��l�ɓ��������悤���ȁc�c";
		next;
		mes "[���[�K��]";
		mes "�N�N�c�c�S�z�S�z";
		mes "�����Ă������A���͗��܂ꂽ�������B";
		mes "���ނȂ�r���Z���g�����݂ȁB";
		next;
		mes "-�ǂ����������킩��Ȃ��B";
		mes "�@�܂�œ��ɔZ���������������l���B";
		mes "�@�Ƃɂ����A�r���Z���g�ɘb�𕷂���-";
		set RA_4QUE,7;
		close;
	case 7:
		mes "[���[�K��]";
		mes "�ȁA������B";
		mes "�܂��A�����p���H";
		mes "�܁A�҂āA���������I";
		mes "���݂����ʂȌ��𗬂��͔̂����悤�I";
		mes "�ȁH�@�ȁH";
		next;
		mes "-�Ƃɂ����A�r���Z���g�����";
		mes "�@�b�𕷂���-";
		close;
	}
}

rachel.gat,273,32,3	script	�q��	931,{
	switch(RA_4QUE) {
	default:
		mes "[�q��]";
		mes "������I�@���O!!";
		mes "�������֍s���I";
		mes "������͈�l�ł������񂾁I";
		close;
	case 8:
		mes "-���̎q�̃|�P�b�g����";
		mes "�@��������ƌ����R��Ă���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�˂��˂��A�N�I";
		next;
		mes "[�q��]";
		mes "����H�@���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ӂ��c�c";
		mes "����ƌ������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�N���t�H�r�G���ˁH";
		next;
		mes "[�q��]";
		mes "���񂽁A�N���H";
		mes "���ł�����̖��O��m���Ă�̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�N�̂�������ɗ��܂�āA";
		mes "�N��T���Ă����̂��B";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c�P�b�I";
		mes "����ȓz�A�e������Ȃ���I";
		mes "�A��I�@�A��I";
		next;
		mes "[�t�H�r�G]";
		mes "������ɐe���Ȃ�āc�c";
		mes "�e���Ȃ�Ă��Ȃ��񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		mes "�Ȃ�A���߂ČN�̃|�P�b�g��";
		mes "�����Ă����΂͗a���点�ĖႤ��B";
		mes "����͂ƂĂ��厖�ȕ��炵���񂾁B";
		next;
		mes "[�t�H�r�G]";
		mes "���c�c����́A������̕����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�R�������Ⴂ���Ȃ��B";
		mes "�N�̂悤�Ȏq�����A";
		mes "�ǂ�����Ă���ȍ����ȕ�΂�";
		mes "��ɓ��ꂽ�񂾂��H";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c�c�c";
		mes "������̂��񂶂�Ȃ����ǁc�c";
		mes "�ł��A�����������Ȃ��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������ȁc�c";
		mes "���ꂪ�����ƁA�r���Z���g����";
		mes "��ςȖڂɂ����Ă��܂��񂾁B";
		mes "�N�̂�������Ȃ񂾂낤�H";
		next;
		mes "[�t�H�r�G]";
		mes "�m������������Ȃ��ˁI";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������H";
		mes "���������Ȃ�΁A�N�̂��ꂳ��A";
		mes "�W�F�j�[������߂��ގ��ɂȂ��H";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c�m���Ă�́H";
		mes "�����̔閧���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��A�����ˁB";
		next;
		mes "[�t�H�r�G]";
		mes "�������c�c";
		mes "�}�}�c�c�O�X�c�c";
		next;
		mes "[�t�H�r�G]";
		mes "�O�X���c�c";
		mes "���Ⴀ�A�������I";
		next;
		mes "[�t�H�r�G]";
		mes "�ł��c�c�ł��A��ΐ��!!";
		mes "�r���Z���g�ׂ̈���Ȃ��񂾂���ȁI";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ��v�����ƌN�̏��肾���ǁA";
		mes "�r���Z���g����́A";
		mes "�N��݂����ƕK���������񂾁B";
		mes "������킩���Ă���̂����H";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c";
		next;
		mes "-�t�H�r�G�͉������킸�A";
		mes "�@�|�P�b�g����T�d�ɕ�΂����o����";
		mes "�@���ɓn����-";
		next;
		mes "-��n���ꂽ��΂́A";
		mes "�@�����ڂ͒n�������A�肪�G��邾����";
		mes "�@�s�v�c�ȗ͂��`����ė���-";
		next;
		mes "-���܂�Ă�����΂���ɓ��ꂽ-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ǂ��H";
		mes "���ƈꏏ�ɂ����~�ɖ߂�Ȃ��H";
		mes "�����e���A�S�z���Ă����B";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c���́A�A�肽���Ȃ��c�c";
		mes "�ł��A������͖������Ɠ`���āB";
		mes "���̂����A����Ď����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "�킩�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��l�ɂ͓`���Ă������ǁA";
		mes "���܂��l�����点�Ȃ��悤��";
		mes "�o���邾�������A���Ă���񂾂�B";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c";
		next;
		mes "-�t�H�r�G�̖������m�F���A";
		mes "�@��΂���ɓ��ꂽ�B";
		mes "�@�r���Z���g����̏��֖߂낤-";
		set RA_4QUE,9;
		close;
	case 9:
		mes "-�t�H�r�G�̖������m�F���A";
		mes "�@��΂���ɓ��ꂽ�B";
		mes "�@�r���Z���g����̏��֖߂낤-";
		close;
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[" +strcharinfo(0)+ "]";
		mes "���낻�낲���e�̌��ɖ߂�����H";
		next;
		mes "[�t�H�r�G]";
		mes "�Ȃ񂾂�I�@��������C��!?";
		mes "������̎��͕����Ă����Ă�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�e�s�F�́A";
		mes "�����K���������񂾂��I";
		next;
		mes "[�t�H�r�G]";
		mes "�c�c�c�c";
		close;
	}
}

//============================================================
// �X�̓��A�N�G�X�g
//- Registry -------------------------------------------------
// RA_5QUE -> 0�`7
//------------------------------------------------------------
rachel.gat,157,183,3	script	�M�k�E�X�e�B�A���[	916,{
	cutin "ra_usti1",2;
	switch(RA_5QUE) {
	case 0:
		mes "[�E�X�e�B�A���[]";
		mes "���Ȃ��ɏ��_�t���C���l��";
		mes "����삪����񎖂��c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�O����̂��q�l�ł��ˁB";
		mes "�����ƁA�t���C���l�ɓ������";
		mes "�A���i�x���c�܂ŎQ��ꂽ�̂ł��傤�B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�������A���i�x���c�̋����́A";
		mes "�t���C���l�𐒔q�������";
		mes "���}�������܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A����ɂ��́B";
		next;
		if(select("�t���C���l�H","�ό����ɗ��������Ȃ̂ł����c�c")==2) {
			cutin "ra_usti2",2;
			mes "[�E�X�e�B�A���[]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c";
			mes "�c�c";
			next;
			mes "[�E�X�e�B�A���[]";
			mes "�t���C���l��M���Ă��Ȃ��Ȃ��!!";
			mes "��X�ً͈��k�����}�������܂���I";
			mes "�ߕt���Ȃ��ł��������I";
			break;
		}
		emotion 33;
		mes "[�E�X�e�B�A���[]";
		mes "�̑�Ȃ鏗�_�t���C���l���h����A";
		mes "�t���C���l�́A��������";
		mes "���@���n���ɓ������ł��傤�B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���Ȃ��ɂ����_�t���C���l�̏j����";
		mes "����񎖂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�h��H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���͐[������ɂ��Ă����܂����A";
		mes "�t���C���l�́A��ɉ�X���������";
		mes "��������Ⴂ�܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ă���c�c�H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����ł��B";
		mes "�́X�c�c�����̂̐�N�푈�ŁA";
		mes "�l�Ԃׂ̈ɖ��E�̎푰�ɗ����������A";
		mes "���͂��g���ʂ����ꂽ�̂ł��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����āA���͗͂����߂��ׁA";
		mes "�_���Ȃ���ꏊ��";
		mes "�[������ɂ��Ă�����̂ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����āA";
		mes "����Ȏ����킩��̂ł����H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�t���C���l��M����҂Ȃ�";
		mes "�F���킩���Ă��鎖�ł��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�t���C���l�̂����t��";
		mes "�t���C���l�̉��g�ł��鋳�c�l��";
		mes "�`���ĉ����邩��ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����ł��B";
		mes "�ƂĂ�ῂ����A�������A";
		mes "�����ɋP�����ł��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�t���C���l�̉��g�ł���";
		mes "����������؋��ł��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "����ɔ�ׁA�����̃G�K�s�I�́c�c";
		mes "���͑��q�̃G�K�s�I�̍߂��򉻂���ׁA";
		mes "���������ŋF�������Ă��܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ�ȍ߂�Ƃ����̂ł����H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�������A�G�K�s�I�̑̒���";
		mes "�����Ȃ�܂����c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�l�̉^���͐_�l�����߂���́B";
		mes "�䂪�q�Ƀt���C���l���������^����";
		mes "�Ȃ��Ă���̂ł��傤�B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "������������ċF������������΁A";
		mes "�����Ă�������͂��ł��B";
		mes "�t���C���l�́A";
		mes "�D�������������_�l�ł�����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "-�c�c���C����Ȃ�-";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���I�@��������B";
		mes "�O����̂��q�l�I";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����Ȃ�̘b�Ő\���킯����܂��񂪁A";
		mes "���肢������܂��B";
		mes "�����Ă��������܂��񂩁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǁA�ǂ����c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�t���C���l�͔��̏��_�B";
		mes "���̐��̔��́A�S�ăt���C���l�̂��́B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����ŁA���̓t���C���l�ׂ̈�";
		mes "�h���[�t��������Ƃ���";
		mes "�ƂĂ��������l�b�N���X��";
		mes "��ɓ��ꂽ�̂ł��I";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�A���i�x���c��A�̗����l����";
		mes "�����������̂ł��B";
		mes "�z�z�z�z�z�b�B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���̃l�b�N���X�������Ɣ������P���΁A";
		mes "�t���C���l������тɂȂ����";
		mes "�v���̂ł��c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�ܘ_�A�������ڂ��ׂ��ł����c�c";
		mes "�ƂĂ�����āc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ�����΁A���̃l�b�N���X��";
		mes "�������Y��ɂȂ�̂ł����H";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�ō��̖��@�𑀂�ō��̃}�W�V�����A";
		mes "�}�q�I�l�ɂ��肢����̂ł��I";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�}�q�I�l�́A�������O�A";
		mes "�X�̓��A�ɂ����l�ގ���";
		mes "�������ꂽ�����ł����c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���̕��ł�����A���̃l�b�N���X��";
		mes "�������P�����鎖���ł���ł��傤�I";
		mes "��`���Ă��������܂��񂩁H";
		next;
		if(select("�\����Ȃ��ł����c�c","�C���Ă�������")==1) {
			mes "[�E�X�e�B�A���[]";
			mes "�c�c�����ł���ˁB";
			mes "�����M�k�Ƃ͂����A";
			mes "�Ԃ̑��l�ł����̂ˁc�c";
			break;
		}
		mes "[�E�X�e�B�A���[]";
		mes "�܂��I�@�{���ł����H";
		mes "���肪�Ƃ��������܂��I";
		mes "�ł́A�l�b�N���X�����a�����܂��B";
		mes "�t���C���l�̌���삪����񎖂��c�c";
		next;
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B";
		mes " ";
		mes "<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		set RA_5QUE,1;
		getitem 7572,1;
		break;
	default:
		mes "[�E�X�e�B�A���[]";
		mes "�ō��̖��@�𑀂�ō��̃}�W�V�����A";
		mes "�}�q�I�l�ł��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�X�̓��A�̐�l�ގ���";
		mes "�������ꂽ�����ł��̂ŁA";
		mes "�܂��A���A�ɂ���������ł��傤�B";
		break;
	case 5:
		if(countitem(7573) < 1) {
			mes "-����H";
			mes "�@�l�b�N���X���ǂ��ɂ��܂������ȁH";
			break;
		}
		mes "[�E�X�e�B�A���[]";
		mes "���Ȃ��ɏ��_�t���C���l��";
		mes "����삪����񎖂��c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�l�b�N���X�́A�ǂ��ł������H";
		next;
		mes "-�l�b�N���X��n����-";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�c�c�܂��I";
		mes "���̔������P���́c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���̎�̒��ɁA���_�l�̗܂̂悤��";
		mes "��������΂��c�c";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "����قǔ�������΂Ȃ�A";
		mes "�t���C���l���G�K�s�I��";
		mes "�����ĉ�����ł��傤�c�c";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "�����I";
		mes "�����Ȃ�̘b�ł����̂�";
		mes "�e�؂ɂ��ĉ����������l�l�I";
		next;
		mes "[�E�X�e�B�A���[]";
		mes "���Ȃ��̗����I�����܂�";
		mes "���_�t���C���l�̌���삪";
		mes "����񎖂��c�c";
		set RA_5QUE,6;
		delitem 7573,1;
		if(checkre())
			getexp 70000,0;
		else
			getexp 700000,0;
		break;
	case 6:
	case 7:
		mes "[�E�X�e�B�A���[]";
		mes "�������_�t���C���l�̌���삪";
		mes "���Ȃ��Ƌ��ɂ���񎖂��c�c";
		break;
	}
	close2;
	cutin "ra_usti1",255;
	end;
}

ice_dun02.gat,120,105,3	script	�X�̒��̒j#ra	924,5,5,{
	switch(RA_5QUE) {
	default:
		end;
	case 1:
		cutin "ra_magic3",2;
		emotion 23;
		mes "[�X�̒��̒j]";
		mes "���A�����̌N�I";
		mes "������������o���Ă���I";
		mes "���̕X�����Ƃ����Ă���!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����āA�X�̒���";
		mes "�����߂��Ă����ł����H";
		next;
		mes "[�X�̒��̒j]";
		mes "�b�͌ゾ!!";
		mes "�܂��́A�����o���Ă���!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�킩��܂����B";
		next;
		mes "-���Ȃ��͋���ȕX�̉��";
		mes "�@����Ȉꌂ��^����-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���[�A�c�c�c�c�����b!!!!";
		next;
		misceffect 1;
		mes "-�K�L���I-";
		next;
		mes "-�V�[�[�[�[�[��-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�т��Ƃ����Ȃ��c�c";
		mes "���̗͂��ᖳ���݂����ł��c�c";
		mes "�ǂ����܂��傤���H";
		next;
		mes "[�X�̒��̒j]";
		mes "�c�c��͂肻�����c�c";
		mes "�ō��̃}�W�V�����ƌ�����";
		mes "���̖��@�Ȃ�������B";
		mes "���̒��x�ł́A�т��Ƃ����񂩁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������āA";
		mes "���Ȃ����}�q�I�l�ł����H";
		next;
		cutin "ra_magic1",2;
		emotion 29;
		mes "[���@�g���}�q�I]";
		mes "�ӁA�����ɂ�!!";
		mes "���͍ō��̃}�W�V�����A�}�q�I�I";
		mes "���̖��@�œV�͔j��I�@�n���􂯂�I";
		mes "�t�n�n�n�n!!";
		next;
		cutin "ra_magic4",2;
		mes "[���@�g���}�q�I]";
		mes "���̕������āA�����̃}�W�V��������";
		mes "������Ȃ��ł���B";
		next;
		mes "[���@�g���}�q�I]";
		mes "���̕��͎����c�������璅�Ă��������B";
		mes "���̎��͂́A�Ƃ�����";
		mes "�E�B�U�[�h�𒴂��Ă���̂���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ƃ���ŁA�ǂ����ĕX�̒���";
		mes "�����߂��Ă����ł����H";
		mes "�}�W�V�������m�̌���ł��H";
		next;
		cutin "ra_magic3",2;
		mes "[���@�g���}�q�I]";
		mes "�c�c�ӂ��c�c����ȗ��R��������";
		mes "�ǂꂾ���}�V���������c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����Ȃ��Ă��܂����̂́A";
		mes "���̗͂������������炾�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�͂��H";
		next;
		emotion 7;
		mes "[���@�g���}�q�I]";
		mes "���ꂪ�c�c�ӂ��c�c";
		mes "���̔��і�Y�߂��������[!!!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���сH";
		mes "���I�@�X�m�E�A�[�̎��ł����H";
		next;
		mes "[���@�g���}�q�I]";
		mes "�������I";
		mes "�v���o�������ŁA�{���Ƀ��J��!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�X�m�E�A�[�����@�Ń}�q�I�l��";
		mes "���点���̂ł���!?";
		mes "����ȋ��͂Ȗ��@���g���Ȃ�āc�c";
		mes "���ꂩ��C�����Ȃ��Ɓc�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "����Ȃ킯�Ȃ��낤���I";
		mes "�܂������c�c�N�͋C�������ȁI";
		mes "�b�́A�Ō�܂ŕ����I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����O�̎����c�c";
		mes "�̂�т�ƊX�Ŏ��Ԃ�ׂ��Ă����́A";
		mes "�l�X�����A�ɂ���X�m�E�A�[�ɂ���";
		mes "�b���Ă���̂𕷂����̂��B";
		next;
		mes "[���@�g���}�q�I]";
		mes "��ʐl�ɂƂ��āA���A�̃����X�^�[��";
		mes "���|�̑Ώۂ�����ȁB";
		mes "�����ɏo���肷��҂͋ɂ߂ď��Ȃ��I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ɋH�ɓ��A�̕X�����߁A";
		mes "���������ė���҂����邪�c�c";
		mes "�܂��c�c�{���ɋɋH�ɁA�̘b���B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�Ƃɂ����I�@�X�m�E�A�[�̂�����";
		mes "�X����ɂ��鎖���ł��Ȃ��Ȃ�A";
		mes "���̎�ŃX�m�E�A�[���������";
		mes "�X�̐l�X�Ɍ����т炩���Ă��";
		mes "���肾�����̂����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ĊO�A�X�m�E�A�[����";
		mes "����������ł��ˁH";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ӂ�A����Ȃ킯���邩�I";
		mes "���͍ō��̃}�W�V�����A�}�q�I�����I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�X�m�E�A�[���x�ɕ�����󂪖����I";
		mes "�c�c�����A���q�ɏ���Ă��܂����̂�";
		mes "��肾�����c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�X�m�E�A�[�Ƃ̐퓬���A";
		mes "�����S�ʂ��������";
		mes "�ō��̖��@�Ńg�h�����h���Ă�낤�B";
		mes "�����v�����I";
		next;
		mes "[���@�g���}�q�I]";
		mes "���̎����̖��@�A�ō����x����";
		mes "���e�I�X�g�[�����������̂��I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ł��A���ꂪ�ԈႢ�������c�c";
		mes "���������A�������Ď���";
		mes "��������Y��Ă����̂��B";
		mes "�c�c�n�n�n!!";
		next;
		mes "[���@�g���}�q�I]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "���e�I�X�g�[���ɂ��h���";
		mes "�o�����X����������A���̃��[�u��";
		mes "���e�I�X�g�[���̉����c�c";
		next;
		emotion 28;
		mes "[���@�g���}�q�I]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		next;
		emotion 52,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "����ŁA�ǂ������̂ł����H";
		next;
		cutin "ra_magic2",2;
		mes "[���@�g���}�q�I]";
		mes "�n�n�n!!";
		mes "���͍ō����x���̖��@�𑀂�";
		mes "�ō��̃}�W�V�����A�}�q�I����!!";
		next;
		mes "[���@�g���}�q�I]";
		mes "�΂��������߂ɁA";
		mes "^0000FF�t���X�g�_�C�o�[^000000�������Ɏg����!!";
		mes "�t�n�n�n�c�c�n�n�c�c";
		next;
		cutin "ra_magic3",2;
		mes "[���@�g���}�q�I]";
		mes "���̂悤�ȍō��̃}�W�V������";
		mes "���̂悤�Ȓv���I�~�X������Ƃ́c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "����ŕX�Â��ɂȂ�����ł��ˁB";
		next;
		cutin "ra_magic4",2;
		mes "[���@�g���}�q�I]";
		mes "�c�c�܂��A�������т�ׂɂ�";
		mes "�d���Ȃ��I���������B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����c�c�c�c";
		mes "���̗͂����܂�ɋ��������B";
		mes "���ꂾ���̘b���B";
		next;
		cutin "ra_magic3",2;
		mes "[���@�g���}�q�I]";
		mes "����Ȏ����A���̔��і�Y��!!";
		mes "��΂ɋ�����!!";
		mes "�z��߁A������ʂ�x��";
		mes "���̎����o�J�ɂ��������̂�!!";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����������X�^�[�̕��ۂŁI";
		mes "��������o����A";
		mes "�o�[�x�L���[�ɂ��Ă��I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�Ƃ͌����Ă݂����̂́c�c";
		mes "��������o���Ȃ�����";
		mes "�����o���Ȃ��c�c";
		mes "�߂����������c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�Ƃ���ŁA�N�͂���ȏ��ɉ��̗p���H";
		mes "�܂����A�N���X�m�E�A�[�ގ����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "�t���C���l�ɕ����邱�̃l�b�N���X��";
		mes "�����Ɣ������P������ׂ�";
		mes "�͂�݂��ė~�����ė����̂ł����c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ӂ��I";
		mes "���̒��x�̎��A���Ȃ�e�Ղ������I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�c�c���A�����ɕ����߂��Ă����";
		mes "�͂�݂��Ă�鎖�͂ł��Ȃ��B";
		next;
		cutin "ra_magic1",2;
		mes "[���@�g���}�q�I]";
		mes "�N��������������o���Ă��ꂽ��A";
		mes "���̃l�b�N���X�𑾗z����ῂ���";
		mes "�P�����Ă����悤�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ƌ����܂��Ă��c�c";
		mes "���̗͂��Ⴑ�̕X��";
		mes "�т��Ƃ����Ȃ���ł����ǁc�c";
		mes "�ǂ������炢���̂ł����H";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ӁA�������ȁc�c";
		mes "�ō��̃}�W�V�����ł��鎄�̖��@��";
		mes "�ȒP�ɂ͔j��񂾂낤�B";
		mes "�c�c�����A���@�ɂ͑���������B";
		mes "�T���Ή�������̕��@������͂����I";
		next;
		mes "[���@�g���}�q�I]";
		mes "���w���̊X�̓쓌��";
		mes "�t���C���̐�Ƃ����ꏊ������B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����Ɏ��ɖ��@�������Ă��ꂽ";
		mes "�t��������͂����I";
		mes "�t���ɂ��̏󋵂��������";
		mes "���������߂Ă���Ȃ����H";
		set RA_5QUE,2;
		close2;
		cutin "ra_magic1",255;
		end;
	case 2:
	case 3:
		mes "[���@�g���}�q�I]";
		mes "�t���̗͂́A";
		mes "�}�W�V�����Ƃ��Ă͕��ʂ��B";
		mes "�����A���̒m���͂��Ȃ�̂��̂��B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�t���̓t���C���̐��";
		mes "�Ǐ�������̂�����B";
		mes "�����炭�A���������ɂ��邾�낤�B";
		close;
	case 4:
		if(countitem(7569) < 1) {
			mes "[���@�g���}�q�I]";
			mes "�t���̗͂́A";
			mes "�}�W�V�����Ƃ��Ă͕��ʂ��B";
			mes "�����A���̒m���͂��Ȃ�̂��̂��B";
			mes "�t���̓t���C���̐��";
			mes "�Ǐ�������̂�����B";
			mes "�����炭�A���������ɂ��邾�낤�B";
			close;
		}
		if(countitem(7572) < 1) {
			mes "[" +strcharinfo(0)+ "]";
			mes "���I�@���܂����I";
			mes "�l�b�N���X�������ė��Ă��܂����I";
			mes "������Ǝ��ɍs���Ă��܂��I";
			next;
			emotion 28;
			mes "[���@�g���}�q�I]";
			mes "����I�@�҂Ă����I";
			mes "��Ɏ��������Ă���ł�";
			mes "��������Ȃ����I";
			close;
		}
		mes "[���@�g���}�q�I]";
		mes "�����I�@�߂������I";
		mes "�҂������тꂽ���I";
		mes "�t���́A���Č����Ă��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̋���ȕX���󂹂�";
		mes "���@�̃n���}�[������Ă���܂����B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�Ȃ�قǁI�@����͗��������I";
		mes "�����I�@��������Ă���!!";
		next;
		mes "-���Ȃ��͕��̃n���}�[��";
		mes "�@����ɂ������莝���A";
		mes "�@�v��������A�X��@�����I-";
		next;
		misceffect 276;
		misceffect 133;
		misceffect 135;
		mes "-�O�H���I";
		mes "�@�K�V���[���I-";
		next;
		classchange 937,1;
		emotion 0;
		mes "[���@�g���}�q�I]";
		mes "!!!!!!";
		mes "����ƁI�@����Ǝ��R�ɂȂꂽ!!";
		next;
		misceffect 56;
		mes "[���@�g���}�q�I]";
		mes "�Ӂc�c�t�n�n�n�n�I";
		mes "�X�ɕ����߂��Ă���ԁA";
		mes "�悭���o�J�ɂ����ȁA���і�Y�I";
		mes "�M�l��Ɍ���Ƃ������t��";
		mes "���݂��Ă��!!!!";
		next;
		monster "ice_dun02.gat",108,109,"�X�m�E�A�[",1775,1,"�X�̒��̒j#ra::OnKilled";
		monster "ice_dun02.gat",114,112,"�X�m�E�A�[",1775,1,"�X�̒��̒j#ra::OnKilled";
		monster "ice_dun02.gat",126,105,"�X�m�E�A�[",1775,1,"�X�̒��̒j#ra::OnKilled";
		monster "ice_dun02.gat",121,99,"�X�m�E�A�[",1775,1,"�X�̒��̒j#ra::OnKilled";
		misceffect 90;
		killmonster "ice_dun02.gat","�X�̒��̒j#ra::OnKilled";
		mes "[���@�g���}�q�I]";
		mes "�t�n�n�n�n�n�n�b!!!!";
		next;
		mes "[���@�g���}�q�I]";
		mes "�����I�@�F��I";
		mes "���x�͌N�̊肢��������Ԃ��I";
		mes "�c�c���ƁB";
		mes "�ǂ�Ȋ肢���������ȁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̃l�b�N���X������������";
		mes "�P�����ė~�����̂ł��B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ӂӁc�c";
		mes "���̍ō��A�ŋ��ł��鎄��";
		mes "����Ȓn���ȕ������点��̂́A";
		mes "���܂�ɂ��ȒP�߂��鎖��!!";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ō��̃}�W�V�����ł��邱�̎���";
		mes "�V���j��A�n���􂯂閂�@�̒B�l�I";
		mes "���̑f���炵���\�͂�";
		mes "����Ȃ����ۂ��Ȏ��Ɏg���̂��H";
		next;
		mes "[���@�g���}�q�I]";
		mes "�˔\�̖��ʎg���I";
		mes "����A���Ԃ̖��ʂ��I";
		mes "�{���Ȃ�A���̎���q�����邾���ł�";
		mes "�N�͊��ӂ��ׂ��Ȃ̂��B";
		next;
		mes "[���@�g���}�q�I]";
		mes "�c�c��������";
		mes "���̃}�q�I�l���A�N�́c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���[���[�A���邳���I";
		mes "�������Ă�I";
		next;
		mes "[���@�g���}�q�I]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		misceffect 256;
		mes "-�s�s�b";
		mes "�@�v�V��-";
		next;
		mes "[���@�g���}�q�I]";
		mes "�c�c�c�c�ӁA�ӂ�I";
		mes "�ŋ߂̎�҂́A���炾�ȁI";
		mes "�܂������c�c�u�c�u�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "���ꂶ��A�肢�͊������B";
		mes "�����A�A��I";
		next;
		mes "[���@�g���}�q�I]";
		mes "���I�@������Ƒ҂āI";
		mes "�����A���������̖��@��";
		mes "�X�̒��ɕ����߂��Ă�����";
		mes "�����ӂ炵���肵����c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�N�́A���e�I�X�g�[����覐΂�";
		mes "���S�����̑̂Ŏ󂯎~�߂鎖�ɂȂ�I";
		mes "�킩�����ȁH";
		mes "�t�t�t";
		next;
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B";
		mes " ";
		mes "<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		set RA_5QUE,5;
		delitem 7569,1;
		delitem 7572,1;
		getitem 7573,1;
		next;
		mes "[���@�g���}�q�I]";
		mes "���ƁA����͏����Ă��ꂽ���炾�B";
		mes "���̕��́A���̐��̕��ł͂Ȃ�";
		mes "�����������������ł��邻�����c�c";
		next;
		mes "[���@�g���}�q�I]";
		mes "�ł́A����΂��B";
		mes "�����N�Ƃ͓�x�Ɖ��Ȃ������F�낤�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�X�́c�c���H";
		mes "�������₽�����ǁc�c";
		mes "���Ɏg���񂾂낤�H";
		next;
		mes "-�c�c���āB";
		mes "�@�E�X�e�B�A���[����ɗ��܂ꂽ";
		mes "�@�d���������ɍς񂾂��A";
		mes "�@�l�b�N���X��Ԃ��ɍs�����I-";
		next;
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B";
		mes " ";
		mes "<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		getitem 7574,4;
		close2;
		classchange 924,1;
		end;
	}
OnKilled:	//�_�~�[�C�x���g
	end;
OnInit:
	initnpctimer;
	end;
OnTimer3600000:
	announce "�������s���I�@�����A�����������X�^�[���I�@�������R�ɂȂ�����R�₵�s�����Ă��I",9,0xFFCE00;
	end;
OnTimer7200000:
	announce "���[�A�c�c�N�����܂��񂩁`�H�@�c�c�c�c�c�c���܂��񂩁`�H",9,0xFFCE00;
	end;
OnTimer10800000:
	announce "�ǂꂾ�����Ԃ��o�����񂾁c�c���͈ꐶ���̂܂܂Ȃ̂��H�@�����c�c",9,0xFFCE00;
	initnpctimer;
	end;
OnTouchNPC:
	emotion 29,"";
	emotion 6;
	end;
}

rachel.gat,264,98,3	script	�n�~�I��	930,{
	switch(RA_5QUE) {
	case 0:
	case 1:
		mes "[�n�~�I��]";
		mes "���́A�Ǐ����ł��B";
		mes "���s�̃K�C�h�Ȃ�";
		mes "���𓖂����Ă��������B";
		close;
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "����ɂ��́B";
		next;
		mes "[�n�~�I��]";
		mes "���̐l�ł����H";
		mes "�������Ǎ��A�Ǐ����Ȃ̂ł��B";
		mes "���s�̃K�C�h�Ȃ�A";
		mes "���̐l�ɗ���ł��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���s�̃K�C�h����Ȃ��āc�c";
		mes "���́c�c�}�q�I�Ƃ����}�W�V������";
		mes "�������ł����H";
		next;
		mes "[�n�~�I��]";
		mes "���b�΂���Ă�����A";
		mes "�n���ȋ����q�̎��ł��ˁB";
		mes "���x�́A������炩�����̂ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "���ꂪ�c�c";
		next;
		mes "-���Ȃ��́A�n�~�I����";
		mes "�@�}�q�I�̏󋵂��������-";
		next;
		mes "[�n�~�I��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�N�b�N�b�c�c";
		mes "�N�b�N�b�N�c�c�A�n�n�n!!";
		next;
		mes "[�n�~�I��]";
		mes "�A�n�n�n�I";
		mes "�Ȃ��Ȃ��ʔ����b�ł��ˁB";
		mes "�ŁA���̎q�͍���";
		mes "�X�̓��A�ɂ���̂ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���s�̃K�C�h����Ȃ��āc�c";
		mes "���́c�c�}�q�I�Ƃ����}�W�V������";
		mes "�������ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B";
		next;
		mes "[�n�~�I��]";
		mes "�����ɂ����������@����������ׂ�";
		mes "���Ȃ����g���Ɉ₵���̂ł��ˁB";
		next;
		mes "[�n�~�I��]";
		mes "�c�c�����ɂ��ڂɂ����Ƃ�";
		mes "�v���Ă��܂�������ǁc�c";
		mes "����ŏ����͔��Ȃ����";
		mes "�����̂ł����c�c";
		next;
		mes "[�n�~�I��]";
		mes "���āc�c";
		mes "���̎q���A���炩������������";
		mes "�J�����Ă����܂��傤���I";
		next;
		mes "[�n�~�I��]";
		mes "�����A���ڍs���������ł����A";
		mes "�ǂ��ɂ�����͋��ł��āc�c";
		mes "�����g���͓̂��ӂȂ�ł����ǂˁB";
		next;
		mes "[�n�~�I��]";
		mes "�ǂ�ǂ�c�c";
		mes "���͂Ȗ��@�̉����c�c";
		mes "�m���A42�y�[�W�ɂ������悤�ȁc�c";
		next;
		mes "-�p���p���c�c�p���c�c-";
		next;
		mes "[�n�~�I��]";
		mes "�c�c�����ׂ̈́c�c";
		mes "�c�c������������c�c";
		mes "�c�c�c�c�y���c�c";
		mes "�c�c�c�c�c�c�c�c�c�c���[��A�悵�I";
		next;
		mes "[�n�~�I��]";
		mes "�}�q�I�ɂ����������@�������ł���";
		mes "���@���킩��܂����B";
		next;
		mes "[�n�~�I��]";
		mes "�������A�������K�v�ȕ�������܂��B";
		mes "���̎q�����ʂ̖��@���g���Ă����";
		mes "����܂��񂩂�ˁB";
		next;
		mes "[�n�~�I��]";
		mes "���@����������ׂɂ́A";
		mes "-���X�ɔ����Ă���n���}�[1��-";
		mes "-���t�E�B���h5��-";
		mes "-�����̃X�N���[��1��-";
		mes "���A�K�v�ɂȂ�܂��B";
		next;
		mes "[�n�~�I��]";
		mes "�����̃X�N���[���́A�ׂ̍�";
		mes "�V���o���c�o���h�̎�s�A�W���m�[�B";
		mes "�����̑�w�Ŕ̔�����Ă��镨�ł��B";
		next;
		mes "[�n�~�I��]";
		mes "���X�A��ς�������܂��񂪁A";
		mes "�ޗ����W�߂Ă��������܂��񂩁H";
		set RA_5QUE,3;
		close;
	case 3:
		if(countitem(1354) < 1 || countitem(996) < 5 || countitem(7433) < 1) {
			mes "[�n�~�I��]";
			mes "���@����������ׂɂ́A";
			mes "-���X�ɔ����Ă���n���}�[1��-";
			mes "-���t�E�B���h5��-";
			mes "-�����̃X�N���[��1��-";
			mes "���A�K�v�ɂȂ�܂��B";
			next;
			mes "[�n�~�I��]";
			mes "�����̃X�N���[���́A�ׂ̍�";
			mes "�V���o���c�o���h�̎�s�A�W���m�[�B";
			mes "�����̑�w�Ŕ̔�����Ă��镨�ł��B";
			close;
		}
		mes "[�n�~�I��]";
		mes "�ޗ����S���������悤�ł��ˁB";
		mes "��m�F�ł����c�c�n���}�[�́A";
		mes "^0000FF���X�Ŕ����Ă���n���}�[^000000�ł����H";
		mes "^FF0000�厖�ɂ��Ă���n���}�[^000000���Ƃ�";
		mes "^FF0000�F�B����؂肽�n���}�[^000000�ł�";
		mes "����܂��񂩁H";
		next;
		if(select("��x�m�F���Ă݂܂�","��肠��܂���")==1) {
			mes "[�n�~�I��]";
			mes "�͂��B";
			mes "�ԈႦ�Ȃ��悤��";
			mes "��������Ɗm�F���Ă��������ˁB";
			close;
		}
		mes "[�n�~�I��]";
		mes "�킩��܂����B";
		mes "�ł́A���Ȃ����W�߂ė���";
		mes "�n���}�[�A���t�E�B���h�A";
		mes "�����̃X�N���[����";
		mes "���̃n���}�[�����܂��B";
		next;
		mes "[�n�~�I��]";
		mes "�X�̎�����j�󂷂�ׁA";
		mes "���̗͂����߂����@�̃n���}�[��";
		mes "���グ��̂ł��B";
		next;
		mes "[�n�~�I��]";
		mes "����ł́c�c�n�@!!";
		next;
		misceffect 71;
		mes "-�t�B�D�[�[�[�[��-";
		next;
		mes "[�n�~�I��]";
		mes "�����A���ꂪ���̃n���}�[�ł��B";
		mes "����ŁA���̎q������߂Ă���X��";
		mes "�@���󂹂ΊJ�������ł��傤�B";
		next;
		mes "[�n�~�I��]";
		mes "�������I�@�@��͈�x�����B";
		mes "�v��������A�@���˂΂Ȃ�܂���B";
		next;
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B";
		mes " ";
		mes "<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		set RA_5QUE,4;
		delitem 1354,1;
		delitem 996,5;
		delitem 7433,1;
		getitem 7569,1;
		close;
	default:
		mes "[�n�~�I��]";
		mes "�t���C���̐�ɂ́A�������⒱������";
		mes "���a�ȕ��͋C������܂��B";
		mes "�����Ŗ{��ǂ�ł���ƁA";
		mes "�{���Ɉ��炰�܂��B";
		close;
	}
}

rachel.gat,113,97,5	script	���n�f�B�A��	929,10,10,{
	switch(RA_5QUE) {
	default:
		mes "[���n�f�B�A��]";
		mes "�ŋ߂͏������A�̂ǂ͊������c�c";
		mes "�������邭�āA";
		mes "�d���Ȃ�Ă������Ȃ��ł��ˁB";
		close;
	case 6:
		mes "[���n�f�B�A��]";
		mes "���Ȃ��ɏ��_�t���C���l�̌���삪";
		mes "����񎖂��I";
		next;
		mes "[���n�f�B�A��]";
		mes "�E�X�e�B�A���[�ɗ��܂��";
		mes "���̋��낵����l���吨���铴�A��";
		mes "�s���ė������l�́A���񂽂��ˁH";
		next;
		mes "[���n�f�B�A��]";
		mes "����Ƃ�����l�Ɛڂ���";
		mes "����̃}�X�^�[�Ƃ��Ȃ�ƁA";
		mes "��ڂł킩���I";
		next;
		mes "[���n�f�B�A��]";
		mes "���̓��A�́A���낵���ˁI";
		mes "�N���A����ȋ��낵�����ւ�";
		mes "�s��������Ȃ��̂Ɂc�c�I";
		next;
		mes "[���n�f�B�A��]";
		mes "��l���Ă̂́A";
		mes "�傫���p�Ƃł����̂����Ă��āA";
		mes "���ѐ��͌ۖ����j��������Ă̂�";
		mes "�{�������H";
		next;
		mes "[���n�f�B�A��]";
		mes "�ւ��ւ��ցc�c";
		mes "�N������Ă��D��S�͎~�܂�Ȃ��ˁI";
		mes "�Ƃ���ŁA�{���ɏ��������ł���ˁB";
		next;
		mes "[���n�f�B�A��]";
		mes "���́A�A���i�x���c���o���āA";
		mes "��炵�₷���͂Ȃ������ǁc�c";
		mes "���X�A���̒n��͌��������y�łˁB";
		mes "�̂����������������ł���!!";
		next;
		mes "[���n�f�B�A��]";
		mes "�z�������邾���N���N�����邵";
		mes "���q���񂪗��Ȃ�������A�S���������";
		mes "�Q�Ă΂��肢������ł����ǂˁ`�B";
		next;
		mes "[���n�f�B�A��]";
		mes "���q���񂽂����A�M�C�ł��ꂽ�̂�";
		mes "��F�������ł���B";
		mes "�����A���̉��܂ŃX�J�[���Ƃ���";
		mes "�C�������������Ȃ��ł����ˁI";
		next;
		mes "[���n�f�B�A��]";
		mes "���̋��낵����l�������Ȃ�������";
		mes "�X�̓��A�ɍs���āA";
		mes "�����Ɨ���ł��������炢�ł���I";
		next;
		mes "[���n�f�B�A��]";
		mes "�c�c�҂Ă�H";
		mes "�X�̓��A�H";
		next;
		emotion 5;
		mes "[���n�f�B�A��]";
		mes "�A�n�b�c�c�I";
		mes "���q����I�@���q����I";
		next;
		mes "-���̌����Ă�ځc�c";
		mes "�@�����������c�c-";
		next;
		mes "[���n�f�B�A��]";
		mes "�A�n�n�n�I";
		mes "���߂ĉ�����ȘV�l�ׂ̈�";
		mes "�X�̓��A�̋��낵����l��";
		mes "�ǂ������Ă����E�җl�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�@�H�@�E�җl!?";
		mes "�������܂ł́A���q���񂾂��āc�c";
		next;
		mes "[���n�f�B�A��]";
		mes "�E�җl!!";
		mes "�����ɍ����Ă��܂���!?";
		mes "�H�₪�R�����͖����ł����H";
		mes "���ƈꏏ�Ɏd�������܂��񂩁H";
		mes "�������ł���I�@�ƁE��E�ЁE�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����H";
		next;
		mes "[���n�f�B�A��]";
		mes "�����ł��I�@�����ł��I";
		mes "����ł����I";
		mes "�E�җl����΂ɑ������Ȃ��A";
		mes "�ׂ��b�ł����!!";
		next;
		if(select("�C���ł��I","����I")==1) {
			mes "[���n�f�B�A��]";
			mes "�����[�A�c�O!!�@���Ɏc�O�ł��I";
			mes "�܊p�A���N��Ԃ̔M�����i�ƂȂ�̂ɁI";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "������x�A�l�������Ă݂܂��񂩁c�c�H";
			close;
		}
		mes "[���n�f�B�A��]";
		mes "����[�A�b�̂킩����ł悩�����I";
		mes "����Ƃ����̂͑��ł�����܂���B";
		mes "���́A�X�̓��A�̃����X�^�[�͐S����";
		mes "�����Ă�炵���̂ł��B";
		next;
		mes "[���n�f�B�A��]";
		mes "���̕X�̐S�����g���āA";
		mes "�̂̒�����������Ȃ���ݕ������΁A";
		mes "�����ƁA�X�����ɂ��邾����";
		mes "�X�͊��ɖ߂����C���ɂȂ�܂���I";
		next;
		mes "[���n�f�B�A��]";
		mes "^FF0000�X�̐S��^000000����ɓ�������";
		mes "���������グ�����Ă��������܂��I";
		mes "^FF00001����375�[�j�[^000000�ŁA�ǂ��ł����H";
		set RA_5QUE,7;
		close;
	case 7:
		if(countitem(7561) < 1) {
			mes "[���n�f�B�A��]";
			mes "�E�җl�͕X�̓��A�̐�l���������";
			mes "�������߂�I�@�������ׂ���I";
			mes "���͊X�̐l����������~���A�����҂��I";
			mes "���������炯�ł���`�I";
			next;
			mes "[���n�f�B�A��]";
			mes "�X�̓��A�ŁA����Y���";
			mes "�傫�ȕX�����肢���܂���!!";
			close;
		}
		mes "[���n�f�B�A��]";
		mes "�ق��ق��I";
		mes "���ꂪ�\�̕X�̐S���ł����H";
		mes "���������Y��ł��ˁI";
		next;
		mes "[���n�f�B�A��]";
		mes "����Ȃ�A";
		mes "^FF0000�A���i�x���c�̕X�͎�^000000��";
		mes "��ꂻ���ł��B";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�A���i�x���c�̕X�͎��H";
		next;
		mes "[���n�f�B�A��]";
		mes "�͂�!!";
		mes "���N�A�A���i�x���c�𐧈�����";
		mes "�A���i�x���c�����̋��ɕX�͂̊��o��";
		mes "�����킹��V�������ݕ��ł��I";
		mes "���́A�X�̐S�����g���ĂˁI";
		mes "�n�n�n�n�b!!";
		next;
		mes "[���n�f�B�A��]";
		mes "�����c�c";
		mes "����ł́A����v�����܂��傤���ˁI";
		next;
		set '@num,countitem(7561);
		mes "[���n�f�B�A��]";
		mes "�ǂ�ǂ�c�c";
		mes "�S����" +'@num+ "�ł��ˁB";
		mes "1����375�[�j�[������c�c";
		mes ('@num*375)+ "�[�j�[�ɂȂ�܂��ˁB";
		next;
		mes "[���n�f�B�A��]";
		mes "�����A�ǂ����󂯎���Ă��������B";
		mes "�܂������񂾂����Ď��Ȃ��ł���ˁH";
		next;
		mes "[���n�f�B�A��]";
		mes "�����ƁA�p�[���Ƃ��܂��傤��I";
		mes "�n�n�n�b�I";
		mes "���̎����������҂����Ă���܂��I";
		delitem 7561,'@num;
		set Zeny,Zeny+('@num*375);
		close;
	}
OnTouch:
	if(RA_5QUE != 6)
		end;
	mes "[���n�f�B�A��]";
	mes "��������Ⴂ�܂��I";
	mes "���A���q����I";
	mes "������ƁI";
	mes "������Ƒ҂��āI";
	close;
}

ice_dun03.gat,126,126,4	script	��#ra1	802,{
	mes "-���͏��������A";
	mes "�@���̐����͂ƂĂ�����ŁA";
	mes "�@���ꂪ���ʂ̉��ł͂Ȃ������킩��-";
	if(RA_5QUE < 6 || (countitem(7574) < 1 && countitem(7562) < 1))
		close;
	if(countitem(7574)) {
		next;
		menu "�X�̕����g��",-;
		mes "-�����x��X�̕��Ƌ���";
		mes "�@���̐����͂����܂���-";
		close2;
		delitem 7574,1;
	}
	else if(countitem(7562)){
		next;
		menu "�X�̗؂��g��",-;
		mes "-�X�̗؂𓊂�������";
		mes "�@���̐����͂����܂���-";
		close2;
		delitem 7562,1;
	}
	hideonnpc;
	set getvariableofnpc('count,"#IceMVP"),getvariableofnpc('count,"#IceMVP")+1;
	if(getvariableofnpc('count,"#IceMVP") == 4)
		donpcevent "#IceMVP::OnStart";
	end;
}
ice_dun03.gat,172,126,4	duplicate(��#ra1)	��#ra2	802
ice_dun03.gat,172,173,4	duplicate(��#ra1)	��#ra3	802
ice_dun03.gat,127,172,4	duplicate(��#ra1)	��#ra4	802

ice_dun03.gat,0,0,0	script	#IceMVP	-1,{
OnStart:
	sleep 2000;
	announce "�g�[���̉��͊Ď��Ɛ����̉�!!�@������������҂�����!!",9,0xFF6633;
	sleep 6000;
	announce "��A�N�g�����i�b�N�X�͂��̕X�̓��A�̎�Ƃ���",9,0xFF6633;
	sleep 2000;
	announce "�g�[���̉�����A���ׂĂ����I",9,0xFF6633;
	sleep 3000;
	announce "�����Ȑl�Ԃ�I",9,0xFF6633;
	sleep 3000;
	announce "���O�́A�����̐ق��D��S�ɂ����",9,0xFF6633;
	sleep 3000;
	announce "�厩�R�̑��܂œ��点�鍓���̋�ɂ𖡂키���낤�I",9,0xFF6633;
	sleep 2000;
	monster "ice_dun03.gat",150,135,"�N�g�����i�b�N�X",1779,1,"#IceMVP::OnKilled";
	end;
OnKilled:
	announce "�I�[�f�B��!!�@�ǂ����A�g�[���̉����炱��������Ă���I",9,0xFF6633;
	announce "�O�H�I�I�I�I�I�I�I�I�I!!",9,0x33FFFF;
	enablenpc "ice_warp1";
	enablenpc "ice_warp2";
	enablenpc "ice_warp3";
	enablenpc "ice_warp4";
	misceffect 247,"ice_warp1";
	misceffect 247,"ice_warp2";
	misceffect 247,"ice_warp3";
	misceffect 247,"ice_warp4";
	initnpctimer;
	end;
OnInit:
OnTimer60000:
	disablenpc "ice_warp1";
	disablenpc "ice_warp2";
	disablenpc "ice_warp3";
	disablenpc "ice_warp4";
	end;
OnTimer7200000:
	stopnpctimer;
	set 'count,0;
	hideoffnpc "��#ra1";
	hideoffnpc "��#ra2";
	hideoffnpc "��#ra3";
	hideoffnpc "��#ra4";
	end;
}

ice_dun03.gat,150,137,0	warp	ice_warp1	2,2,ice_dun04.gat,33,144
ice_dun03.gat,138,148,0	warp	ice_warp2	2,2,ice_dun04.gat,33,144
ice_dun03.gat,161,148,0	warp	ice_warp3	2,2,ice_dun04.gat,33,144
ice_dun03.gat,151,162,0	warp	ice_warp4	2,2,ice_dun04.gat,33,144

ice_dun04.gat,33,166,4	script	����������N	925,{
	cutin "ra_sboy",2;
	mes "[" +strcharinfo(0)+ "]";
	mes "�N�g�����i�b�N�X������Ă����̂�";
	mes "���̏��N���c�c";
	next;
	mes "-�X�͂̂悤�ɍd���������";
	mes "�@�X�̒��̏��N�̎p�́A";
	mes "�@�����߂��Ă���ƌ�������";
	mes "�@�����Ă��邩�̂悤�Ɍ�����-";
	next;
	mes "-���N�𕕈󂵂Ă��鋐��ȕX������";
	mes "�@������C�����o���A�s�v�c�ȗ͂�";
	mes "�@������ꂽ-";
	next;
	mes "-���N�͓����瑫�̐�܂ŁA��؂̗l��";
	mes "�@�Y��ȏ����̎p�����Ă���-";
	next;
	mes "-���́A�܂��c�����N��";
	mes "�@�X���ɕ����߂��Ă���̂��c�c";
	mes "�@���̗₽������͂ǂ�����Ă�";
	mes "�@�����ł��Ȃ�������������-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "��́c�c�ǂ�Ȕ閧��������";
	mes "���N�Ȃ񂾂낤�c�c";
	close2;
	cutin "ra_sboy",255;
	end;
}

ra_san04.gat,137,48,0	script	���[�~��-1���̋@��	111,{
	mes "-�X�̓��A�ɕ��󂳂ꂽ^3333FF���[�~��^000000-";
	mes "���@�댯�x : 1��";
	next;
	mes "�i�O���j�������A";
	mes "�_�̑㗝�l�ł��鋳�c�Ƃ���";
	mes "���܂ꂽ�q���́A�o�q�������c�c";
	next;
	mes "�o�q�A�������j�q�����c�̏؂ł���";
	mes "�������Ɣ��������Ēa�������̂��B";
	mes "�o�Y����`���Ă�����_���j���G���́A";
	mes "��l�̐Ԏq���Q�ĂĈ������A";
	mes "���w���ɘA��A��A�u�������B";
	next;
	mes "���ꂩ��A12�l�̑�_���ŉ���J���A";
	mes "���̌��ɂ��ċc�_���鎖�ɂ����B";
	next;
	mes "��X���c�Ƃ��Đ��܂��q�́A��l�B";
	mes "���q���������݂��Ă����B";
	mes "�o�q�A�������j�q�����܂ꂽ���́A";
	mes "��_�������̊Ԃɑ傫�ȍ������Ă񂾁B";
	next;
	mes "�����ԁA�o�q�ɑ΂��錋�_�͏o���A";
	mes "���Ԃ������߂����B";
	next;
	mes "�����āA�����c�_�̖��ɁA";
	mes "���[�~���iLoomin�j�Ɩ��Â���ꂽ";
	mes "�o�q�̒j�q���A";
	mes "�S�Ă̖��𓀂点��ƌ�����";
	mes "�X�̓��A�ɕ��󂷂鎖�ɂ����B";
	next;
	mes "�X�̓��A�́A";
	mes "���낵����C�𐁂��o�������X�^�[�A";
	mes "�N�g�����i�b�N�X�����ꏊ�ŁA";
	mes "�N���߂Â��Ȃ��ꏊ�������B";
	next;
	mes "12�l�̑�_���́A";
	mes "���̃g�[���ΎR���玝���Ă���";
	mes "�l�̃g�[���̉��������ɂ��A";
	mes "�N�g�����i�b�N�X��q�˂��B";
	next;
	mes "�����āA�j�q�𕕈󂵁A���Ȃ����";
	mes "�����Ă���g�[���̗͂��ĂыN�����A";
	mes "�X�̓��A��n�����Ă��Ƌ����A";
	mes "�N�g�����i�b�N�X�Ƃ̌_��ɐ��������B";
	next;
	mes "�N�g�����i�b�N�X�͎����̑���";
	mes "���[�~���𕕈󂵁A";
	mes "�X�̓��A�Ɠ����̖��ׂ̈�";
	mes "�����蓴�A��q�˂�҂�";
	mes "�F�E���ɂ����B";
	close;
}